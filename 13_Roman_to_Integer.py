#!/usr/bin/env python
# -*- coding: utf-8 -*-
class Solution(object):
    def romanToInt(self, s):
        """
        :type s: str
        :rtype: int
        """
        if not len(s):
            return 0
        ans, preval = 0,0 
        d = {'M':1000, 'D':500, 'C':100, 'L':50, 'X':10, 'V':5, 'I':1}
        for i in range(len(s)-1,-1,-1):
            if s[i] in d:
                # like IV ,CM
                if d[s[i]] < preval:
                    d[s[i]] = -d[s[i]]
                preval = d[s[i]]
                ans = ans + d[s[i]]
        return ans



def main():
    yjn = Solution()
    print yjn.romanToInt('MCCXXXIV')
if __name__ == '__main__':
    main()