#!/usr/bin/python
from datetime import *
import time


start_time = datetime.now()

time.sleep(20)
# uptime_string = str(timedelta(seconds = now_time))
uptime = datetime.now() - start_time
print(uptime)
