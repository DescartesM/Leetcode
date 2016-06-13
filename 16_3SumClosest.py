#!/usr/bin/env python
# -*- coding: utf-8 -*-
class Solution(object):
    def threeSumClosest(self, nums, target):
        """
        :type nums: List[int], int 
        :rtype: int
        """       
        
        max_int = pow(2,31)
        if len(nums) < 3:
            return None
        # be used in after
        nums.sort()
        for i in range(len(nums)):
            if i > 0 and nums[i-1] == nums[i]:
                continue
            # two points
            point_i,point_j = i+1, len(nums)-1

            while point_i < point_j:
                tmp = nums[point_i] + nums[point_j] + nums[i]
                print tmp
                delta = abs(tmp - target)
                if delta == 0:
                    return tmp
                # status update
                if delta < max_int:
                    max_int = delta
                    result = tmp
                if tmp < target:
                    point_i += 1
                else:
                    point_j -= 1

        return result
    
def main():
    yjn = Solution()
    print yjn.threeSumClosest([1,2,3,4],9)


if __name__ == '__main__':
    main()
