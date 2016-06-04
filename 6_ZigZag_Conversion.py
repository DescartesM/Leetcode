#!/usr/bin/env python
# -*- coding: utf-8 -*-
class Solution(object):
     def convert(self, s, numRows):
        """
        :type s: str
        :type numRows: int
        :rtype: str
        """
        if numRows == 1 or numRows >= len(s):
                    return s
        # shu zu zhi zhen
        L = [''] * numRows
        index, step = 0, 1
        # step is the direction
        for x in s:
            L[index] += x
            if index == 0:
                step = 1
            elif index == numRows -1:
                step = -1
            index += step

        return ''.join(L)

def main():
    yjn = Solution()
    print yjn.convert("abcdefg", 4)
if __name__ == '__main__':
    main()