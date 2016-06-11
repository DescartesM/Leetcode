#!/usr/bin/env python
# -*- coding: utf-8 -*-
class Solution(object):
    def isPalindrome(self, x):
        """
        :type x: int
        :rtype: bool
        """
        if x < 0 or x > pow(2, 31):
            return 0
        tmp = []
        while x > 9: 
            tmp.append(x%10)  
            x = x / 10 
            #print len(tmp)
        tmp.append(x)
        # zui da si ran bi jiao
        yjn = tmp[::-1]
        if yjn == tmp:
            return True
        return False


def main():
    yjn = Solution()
    print yjn.isPalindrome(191)
if __name__ == '__main__':
    main()