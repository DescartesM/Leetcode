#!/usr/bin/env python
# -*- coding: utf-8 -*-
__author__ = 'yjn'
import time
# Given an array and a value, remove all instances of that value in place and return the new length.
# 112233
class Solution(object):
    def removeElement(self, nums, val):
        """
        :type nums: List[int]
        :type val: int
        :rtype: int
        """
        if len(nums) == 0:
            return 0
        i, j = 0, len(nums) -1
        ans = len(nums)

        while i < j:
            if nums[i] == val:
                temp = nums[i]
                nums[i] = nums[j]
                ans -=1
                j -=1
            else:
                i +=1
        if nums[j] == val:
            ans -= 1
        # print nums
        return ans

def main():
    start = time.clock()
    yjn = Solution()
    print yjn.removeElement([1,3,3,3],3)
    print "%s sec" % (time.clock() - start )

if __name__ == '__main__': 
    main()
    