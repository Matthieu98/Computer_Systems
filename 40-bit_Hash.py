import hashlib
import random
import string


dictionary = {}

#randomStr = ''.join(random.choice(string.ascii_lowercase+string.digits) for _ in range(10))
#hashValue = hashlib.sha1(randomStr.encode('utf-8')).hexdigest()

def randomStringGen():
    return hex(int(''.join(random.choice(string.digits) for _ in range(10))))

def hashValueGen(s):
    return hashlib.sha1(s.encode('utf-8')).hexdigest()

def problemTwo():
    count = 0
    while True:
        count = count+1
        s = randomStringGen()
        hashVal = hashValueGen(s)[0:10]
        if hashVal in dictionary:
            return (s, dictionary[hashVal], count)
        else:
            dictionary[hashVal] = s

print (problemTwo())