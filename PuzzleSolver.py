import socket
import hashlib
import string
import random
import time

TCP_IP = '127.0.0.1'
TCP_PORT = 5005
BUFFER_SIZE = 1024
s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
s.connect((TCP_IP, TCP_PORT))

def blockchain_puzzle(target):
    start = time.time() # start timer

    # random data to mimic data in blockchain header
    p_prev = "21312476870123241093"
    p_root = "65324987025126798347"
    time_stamp = "5234176896370832"

    while (True):
        hash_val = hashlib.sha256(p_prev + p_root + time_stamp)
        if (try_nonce(hash_val, target)):
            end = time.time()
            return (end-start) # time to solve puzzle

def try_nonce(hash_val, target):
    nonce = int(random.getrandbits(32)) # generate random nonce
    hash_val.update(str(nonce)) # update hash with nonce
    hash_as_int = int(hash_val.hexdigest(), 16)

    # check if the hash (as an integer) is less than the target
    if (hash_as_int < target):
        return True
    return False

# Code below will calculate 5 solutions for a target
target = 1725436586697640946858688965569256363112777243042596638790631055949823
for i in range(5):
    ans = blockchain_puzzle(target)
    MESSAGE = str(ans)
    s.send(MESSAGE)
    data = s.recv(BUFFER_SIZE)
    print "The hash was lower than the target in", data, "seconds"

# MESSAGE = ans

# s = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
# s.connect((TCP_IP, TCP_PORT))
# s.send(MESSAGE)
# data = s.recv(BUFFER_SIZE)
s.close()

# print "received data:", data