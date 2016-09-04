#!/usr/bin/env python
# -*- coding: utf-8 -*-
__author__ = 'yjn'
import time
# Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
# compare ()

class Solution(object):
    def generateParenthesis(self, n):
        """
        :type n: int
        :rtype: List[str]
        """
        if n == 0:
            return []
        res = []
        string = ""
        def generate(res, string, a, b):
            if(a == 0 and b == 0):
                res.append(string)
                return res
            if b >0:
                generate(res, string + ')', a, b-1)
            if a >0:
                #print string
                generate(res, string + '(', a-1, b+1)
        generate(res, string ,n, 0)
        return res

def main():
    start = time.clock()
    yjn = Solution()
    print yjn.generateParenthesis(3)
    print "%s sec" % (time.clock() - start )

if __name__ == '__main__': 
    main()
    