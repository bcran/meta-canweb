from sse import Sse
import time
from datetime import datetime

def application(env, start_response):
    print(env)

    session = Sse()
    headers = []
    headers.append(('Content-Type', 'text/event-stream'))
    headers.append(('Cache-Control', 'no-cache'))
    headers.append(('X-Accel-Buffering', 'no'))
    start_response('200 OK', headers)
    while True:
        time.sleep(5)
        now = datetime.now()
        session.add_message('message', str("Data: " + now.strftime("%H:%M:%S")))
        yield str(session).encode("ascii")

