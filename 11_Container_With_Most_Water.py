#!/usr/bin/env python
# -*- coding: utf-8 -*-
class Solution(object):
    def maxArea(self, height):
        """
        :type height: List[int]
        :rtype: int
        """
        if not len(height):
            return 0
        i = 0
        j = len(height) - 1
        tmp = min(height[i],height[j])*(j-i)
        while i+1 < j:
            if height[i] < height[j]:
                i = i + 1
            else:
                j = j - 1
            area = min(height[i],height[j])*(j-i)
            if area > tmp :
                tmp = area
        print i ,j
        return tmp



def main():
    yjn = Solution()
    print yjn.maxArea([1,2,3,4,5,3,2,1])
if __name__ == '__main__':
    main()