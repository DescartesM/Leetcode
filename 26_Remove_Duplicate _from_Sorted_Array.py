#!/usr/bin/env python
# -*- coding: utf-8 -*-
__author__ = 'yjn'
import time
# Given a sorted array, remove the duplicates in place such that each element appear only once and return the new length.
# 112223333
class Solution(object):
    def removeDuplicates(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        if len(nums) == 0:
            return 0
        if len(nums) == 1:
            return 1
        i, j = 0, 1
        ans = 1
        for j, k in enumerate(nums):
            if nums[j] > nums[i]:
                i+=1
                ans+=1
                temp = nums[i]
                nums[i] = nums[j]
                nums[j] = nums[i]
        #print nums
        return ans



def main():
    start = time.clock()
    yjn = Solution()
    print yjn.removeDuplicates([1,1,2,3])
    print "%s sec" % (time.clock() - start )

if __name__ == '__main__': 
    main()
    