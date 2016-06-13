#!/usr/bin/env python
# -*- coding: utf-8 -*-
class Solution(object):
    def threeSum(self, nums):
        """
        :type nums: List[int]
        :rtype: List[List[int]]
        """
        result = []
        results = []
        target = 0        
        # be used in after
        if len(nums) < 3:
            return results
        nums.sort()
        for i in range(len(nums)):
            # NICE
            if target < nums[i]*3 or target > nums[-1]*3:  # take advantages of sorted list
                break
            if i == 0 or i > 0 and nums[i-1] != nums[i]:
                # used 2-sum to solve, and reduce (DFS)
                self.twosum(nums[i+1:], target-nums[i], result+[nums[i]], results)

        return results
    def twosum(self, nums, target, result, results):
        if len(nums) < 2:
            return
        # er fen points
        point_i,point_j = 0, len(nums)-1
        while point_i < point_j:
            if nums[point_i] + nums[point_j] == target:
                results.append(result + [nums[point_i], nums[point_j]])
                point_i += 1
                point_j -= 1
                # to kill the same result example:[-2,0,0,2,2]
                while point_i < point_j and nums[point_i] == nums[point_i-1]:
                    point_i += 1
                while point_i < point_j and nums[point_j] == nums[point_j+1]:
                    point_j -= 1
            # take advantages of sorted list
            elif nums[point_i] + nums[point_j] < target:
                point_i += 1
            else:
                point_j -= 1
        return


    
def main():
    yjn = Solution()
    print yjn.threeSum([0,0,0])
if __name__ == '__main__':
    main()