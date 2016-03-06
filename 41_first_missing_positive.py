#!/usr/bin/env python
# -*- coding: utf-8 -*-
def counts(nums):
        maxval = -10000
        if len(nums) == 0:
            return 1
        for elem in nums:  
            if maxval<elem:  
                maxval=elem 
    
        counter=[0]*(maxval+1)
            
        for elem in nums:
            if elem >= 0:
                counter[elem] += 1
        # print counter
        iter=0
        for i in range(len(counter)):
            if counter[i]>0 and i != 0:
                nums[iter]=i
                iter+=1
        i = 0
        print nums
        while i < len(nums) :
            if nums[i] != i+1:
                return i+1
            i += 1
        return len(nums)+1   

def main():
    A=[1,2]
    print counts(A)

if __name__=="__main__":
    main()
#####################################################################

#key point 
#count sort 
#tong pai xu

#####################################################################
# one trick way
"""
a =[1,2,3]
a yihuo 1,2,3,4 (n+1) = ans
shudian sixiang weicaozuo
"""