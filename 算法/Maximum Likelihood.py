#!/usr/bin/env python
# -*- coding: utf-8 -*-
# zui da si ran fa
class Solution(object):
    def longestPalindrome(self, s):
        if self.isP(s):
            return s
        substr=['']
        l=0
        res=''
        for i in s:
            substr+=[i + sub for sub in substr]
            #substr=substr[::-1]

        for item in substr:
            if self.isP(item):
                if len(item)>l:
                    res=item
                    l=len(item)
            print item
        return res

    def isP(self,s):
        return s==s[::-1]
            

def main():
    yjn = Solution()
    print yjn.longestPalindrome("caba")
if __name__ == '__main__':
    main()