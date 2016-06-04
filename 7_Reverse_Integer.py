#!/usr/bin/env python
# -*- coding: utf-8 -*-
class Solution(object):
    def reverse(self, x):
        """
        :type x: int
        :rtype: int
        """
        flag = False
        tmp = str(x)
        if tmp[0] == '-':
            tmp = tmp[1:]
            flag = True
        tmp = int(tmp[::-1])
        # if negative?
        if flag:
            tmp = - tmp
        # if overflow ?
        if abs(tmp) >= pow(2, 31):
            return 0
        return tmp

def main():
    yjn = Solution()
    print yjn.reverse(-1534236469)
if __name__ == '__main__':
    main()