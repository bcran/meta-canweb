from sse import Sse
import time
import json
from datetime import datetime
import bluetooth
import subprocess

def pair_candue_bluetooth():
    subprocess.call("bluetoothctl << EOF\n" +
                    "agent off\n" +
                    "power on\n" +
                    "pairable on\n" +
                    "agent NoInputNoOutput\n" +
                    "default-agent\n" +
                    "EOF", shell=True)

    # It seems a sleep is needed after a cold power-on
    time.sleep(2)
    devices = bluetooth.discover_devices()
    socket = bluetooth.BluetoothSocket(bluetooth.RFCOMM)
    candue_board_bda = '3C:71:BF:C7:C2:1E'
    socket.connect((candue_board_bda, 1))
    #data = socket.recv(1024);
    #print(data)
    #socket.close()


def application(env, start_response):
    print(env)

    pair_candue_bluetooth()

    session = Sse()
    headers = []
    headers.append(('Content-Type', 'text/event-stream'))
    headers.append(('Cache-Control', 'no-cache'))
    headers.append(('X-Accel-Buffering', 'no'))
    start_response('200 OK', headers)
    while True:
        time.sleep(5)
        now = datetime.now()
        data = { "time": now.strftime("%H:%M:%S") }
        session.add_message('message', json.dumps(data))
        yield str(session).encode("ascii")
