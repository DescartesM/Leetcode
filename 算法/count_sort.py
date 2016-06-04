#!/usr/bin/env python
# -*- coding: utf-8 -*-

def counts(A):
    maxval=-1000
    
    for elem in A:
        if maxval<elem:
            maxval=elem
    
    counter=[0]*(maxval+1)
    
    for elem in A:
        counter[elem]+=1
    print counter
    iter=0
    for i in range(len(counter)):
        while counter[i]>0:
            print i
            A[iter]=i
            iter+=1
            counter[i]-=1
    print A

def main():
    A=[8,9,22,1,2,2,7]
    counts(A)

if __name__=="__main__":
    main()
