#!/usr/bin/env python
# -*- coding: utf-8 -*-
class Solution(object):
    def myAtoi(self, s):
        """
        :type str: s
        :rtype: int
        """
        flag = False
        while len(s) > 0 and s[0] == ' ':# deal with space 
            s = s[1:]
        if len(s)> 0 and (s[0] == '+' or s[0] == '-'): # deal with positive/negative sign
            if s[0] == '-':
                flag = True
            s = s[1:]
        i = 0
        # ord char to int
        while i <len(s) and ord(s[i]) in range(48,58):
            i += 1

        r = 0
        if i > 0:
            r = int(s[:i])
        if flag:
            r *= -1
        # pow zhi hus 2^31 - 1 in case of overflow
        return max(min(r, pow(2, 31)-1), -pow(2,31))

def main():
    yjn = Solution()
    print yjn.myAtoi("-123")
if __name__ == '__main__':
    main()