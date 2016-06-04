#!/usr/bin/env python
# -*- coding: utf-8 -*-
#DFS of graph

class Solution(object):
    def addOperators(self, num, target):
        """
        :type num: str
        :type target: int
        :rtype: List[str]
        """
        res, self.target = [], target
        for i in range(1, len(num) + 1):
            if i == 1 or (i > 1 and num[0] != "0"):
                self.dfs(num[i:], num[:i], int(num[:i]), int(num[:i]), res)
        return res
    def dfs(self, num, temp, cur, last, res):
        if not num:
            if cur == self.target:# judge if equals
                res.append(temp)
            return
        for i in range(1,len(num)+1):
            val = num[:i]
            print val
            if i == 1 or (i > 1 and num[0] != "0"):# reduce
                self.dfs(num[i:], temp + "+" + val, cur + int(val), int(val), res)
                self.dfs(num[i:], temp + "-" + val, cur - int(val), -int(val), res)
                self.dfs(num[i:], temp + "*" + val, cur - last + last*int(val), last*int(val), res)

def main():
    yjn = Solution()
    print yjn.addOperators("123", 6)

if __name__ == '__main__':
    main()