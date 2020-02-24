from sse import Sse
import time
import json
from datetime import datetime
import bluetooth
import subprocess

teslatime = datetime.utcfromtimestamp(0)
teslaelevation = 0

TESLADAT_MAGIC = 0x7E31ADA7
TESLADAT_ELEVATION = 2
TESLADAT_TIME = 4


def btconnect():
    subprocess.call("bluetoothctl << EOF\n" +
                    "agent off\n" +
                    "power on\n" +
                    "pairable on\n" +
                    "agent NoInputNoOutput\n" +
                    "default-agent\n" +
                    "EOF", shell=True)

    time.sleep(2)
    bluetooth.discover_devices()
    cs = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
    cs.connect(('3C:71:BF:C7:C2:1E', 1))
    print("Bluetooth connected.")
    return cs


def btrx(cs):
    global teslaelevation
    global teslatime
    data = cs.recv(4)
    magic = int.from_bytes(data, byteorder="little")
    data = cs.recv(4)
    id = int.from_bytes(data, byteorder="little")
    data = cs.recv(4)
    int.from_bytes(data, byteorder="little")
    data = cs.recv(4)
    payload = int.from_bytes(data, byteorder="little")

    if magic != TESLADAT_MAGIC:
        return False

    if id == TESLADAT_ELEVATION:
        teslaelevation = str(payload)
    if id == TESLADAT_TIME:
        teslatime = datetime.utcfromtimestamp(payload)

    return True


def application(env, start_response):
    print(env)

    session = Sse()
    headers = []
    headers.append(('Content-Type', 'text/event-stream'))
    headers.append(('Cache-Control', 'no-cache'))
    headers.append(('X-Accel-Buffering', 'no'))
    start_response('200 OK', headers)
    cs = btconnect()

    while True:
        ret = btrx(cs)
        if ret is False:
            continue
        data = {"time": teslatime.strftime("%Y-%m-%d %H:%M:%S")}
        session.add_message('message', json.dumps(data))
        yield str(session).encode("ascii")
