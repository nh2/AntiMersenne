#!/usr/bin/env python2
import socket
import random
import sys
import os
import signal

flag ="foobar"

signal.signal(signal.SIGCHLD, signal.SIG_IGN)
s = socket.socket()
s.setsockopt(socket.SOL_SOCKET, socket.SO_REUSEADDR, 1)
s.bind(("0.0.0.0", 8888))
s.listen(10)
while 1:
	c, _ = s.accept()
	if c is None:
		sys.exit(1)
	if os.fork() == 0:
		del s
		break
	del c

c.sendall("Welcome to this little guessing game!\n")
r = random.Random()
r.seed(os.urandom(16))
guess_limit = 10
guess_right = 0
data = ""
while 1:
	answer = str(r.getrandbits(64))
	c.sendall("You have %d/%d right guesses, whats your next guess? " % (guess_right, guess_limit))
	while "\n" not in data:
		cur = c.recv(4096)
		if not cur:
			sys.exit(0)
		data += cur
	guess, data = data.split("\n", 1)
	if guess != answer:
		guess_right = 0
		c.sendall("Nope, that was wrong, correct would have been %s...\n" % answer)
		continue
	guess_right += 1
	if guess_right < guess_limit:
		c.sendall("Yes! That was correct, awesome...\n")
		continue
	c.sendall("You did it! The flag is: %s" % flag)
	sys.exit(0)
