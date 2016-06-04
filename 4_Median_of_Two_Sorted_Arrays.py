#!/usr/bin/env python
# -*- coding: utf-8 -*-
# zui da si ran fa
class Solution(object):
    def findMedianSortedArrays(self, nums1, nums2):
        """
        :type nums1: List[int]
        :type nums2: List[int]
        :rtype: float
        """
        m, n = len(nums1), len(nums2)
        if m > n:
            nums1, nums2, m, n = nums2, nums1, n, m
        if n == 0:
            raise ValueError

        imin, imax, half_len = 0, m, (m + n + 1) / 2
        # actually use the edge to achieve the diedai
        while imin <= imax:
            # O(log(min(m,n))) in here
            i = (imin + imax) / 2
            j = half_len - i
            # i, j zero is edge Q
            if j > 0 and i < m and nums2[j-1] > nums1[i]:
                # i is too small, must increase it
                imin = i + 1
            elif i > 0 and j < n and nums1[i-1] > nums2[j]:
                # i is too big, must decrease it
                imax = i - 1
            else:
                # i is perfect
                if i == 0: 
                    max_of_left = nums2[j-1]
                elif j == 0: 
                    max_of_left = nums1[i-1]
                else: 
                    max_of_left = max(nums1[i-1], nums2[j-1])
                # array is odd
                if (m + n) % 2 == 1:
                    return max_of_left

                if i == m: 
                    min_of_right = nums2[j]
                elif j == n: 
                    min_of_right = nums1[i]
                else: 
                    min_of_right = min(nums1[i], nums2[j])

                return (max_of_left + min_of_right) / 2.0  

def main():
    yjn = Solution()
    print yjn.findMedianSortedArrays([1,2,3],[10,11,12,13])
if __name__ == '__main__':
    main()