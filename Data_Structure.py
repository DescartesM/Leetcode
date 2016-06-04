#!/usr/bin/env python
# -*- coding: utf-8 -*-

#Python2.7.10 API charpter Five Data Structure

#######################################List[]################################################
# List is equals stack
stack = [1,2,3]
stack.append(4) # append func return a None Type
print stack
stack.pop()
print stack
stack.pop()
print stack


# List can be used as a queue
from collections import deque # what's the amazing package
queue = deque(["yjn","asf","sss"])
queue.append("Tony")
print queue
print queue.popleft()
print queue.popleft()
print queue.popleft() # be care of stackoveflow


# three inner useful func (filter, map, reduce)
def f(x):
    return x % 2 != 0 and x % 3 != 0

print filter(f, range(2,22))
#fliter just behaved like a ture filter to modified a List or other data structure
seq1 = range(8)
seq2 = range(8) # if the two Lists length is not equal, will return a None Type,sometimes will cause a err
def add(x,y):
    return x+y
print map(add, seq1,seq2)

# map is similiar to fliter

def add2(x,y):
    return x + y

print reduce(add, range(1,11))

# reduce is equal to recursive
 
# Matrix func
matrix = [
    [1,2,3,4],
    [5,6,7,8],
    [9,10,11,12],
]
print [[row[i] for row in matrix] for i in  range(4)] # 2D transposed

# equals as ...
transposed = []

for i in range(4):
    transposed.append([row[i] for row in matrix])
print transposed

# but in fact,which is used in project....as following inner func trans
print list(zip(*matrix)) # 2D so use *

###########################################List[]################################################

###########################################tuple()################################################
sigleton = 'hello',     #sigle must have ,
print len(sigleton)

t = 123, 45.5, 'yjn'
print t
#tuple is like str can not be changed,used to record some important data
###########################################tuple()################################################

###########################################dict{}################################################
tel = {'yjn':156489,'thn':456464}

tel['ssss'] = 15
print tel

del tel['yjn']
print tel

print tel.keys()

# dict gouzao func
print dict([('yjn',1111),('wwww',2222)])

#a way to make fast encode
for i, v in enumerate(['a','x','s']):
    print i, v

# 2D use zip() to package
questions = ['name', 'quest','favor']
answers = ['yjn','the holy grail','playing chess']

for q, a in zip(questions,answers):
    print 'What\'s your {0}? It is {1}.'.format(q, a)

# some useful func in dict

# 1.reversed a seq
for i in reversed(xrange(1,10,2)):
    print i

# 2. sorted default sort the seq ,and will delete these repeated items
basket = ['apple','orange','pear','orange']
for f in sorted(set(basket)):
    print f 
    
###########################################dict{}################################################


