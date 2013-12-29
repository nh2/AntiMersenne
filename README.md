AntiMersenne
============

Predicting Python's Mersenne twister PRNG for 30c3 CTF, with Python calling Java, yeah


Running
-------

```
cd bin
./predict.py
```

Side notes
----------

* Had to fiddle around a bit with `sign()` between Python/Java because Java has no unsigned ints
* The Mersenne I've implemented in Java doesn't actually seem to generate Python's output even with the same internal state
* This didn't matter, I just read the observed generated pseudo-random numbers in Python, send them to Java, reconstruct the state there using `rev`, and set that state in Python with `r.setstate()`
* My observed input numbers are 64 bit, my Java reverser takes 32 bit numbers, so I un-concatenate them with `splitInto32()`
* Thanks to Ruth for the idea that I can convert a 32 bit int in Python to a 32 bit uint using `% (2*32)`


Sources
-------

* [Python's random docs, describing that Mersenne is used](http://docs.python.org/2/library/random.html)

* [Main article that helped me solve it](http://jazzy.id.au/default/2010/09/22/cracking_random_number_generators_part_3.html)
* [Similar proof of concept, but for cases where only 8 bit numbers are generated from the 32 bit output that Mersenne creates (randint(0, 255) just takes the first 8 bits)](https://spideroak.com/blog/20121205114003-exploit-information-leaks-in-random-numbers-from-python-ruby-and-php)
* [Similar thing for C#, not so well explained, but this shows how the thing would operate on uint32 which Java doesn't have](http://b10l.com/?p=24)

* [Python's random module](https://github.com/certik/python-2.7/blob/master/Lib/random.py)
* [Python's _random C module (much of the actual code)](https://github.com/certik/python-2.7/blob/master/Modules/_randommodule.c)

* [Not relevant for the cPython implementation, but interesting](http://code.activestate.com/recipes/578056-mersenne-twister/)
