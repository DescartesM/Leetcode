#!/usr/bin/env python
# -*- coding: utf-8 -*-
# Hash Table 
# key-value
# You may assume that each input would have exactly one solution.
# So that you may ignore the hash conflict.
# this question would be asked in Baidu exam (to solve the TopK question)
class Solution:
    def twoSum(self, num, target):
        map = {}# extends from dict
        for i in range(len(num)):
            if num[i] not in map:
                map[target - num[i]] = i + 1
            else:
                return map[num[i]], i + 1
            #print map
        return -1, -1
def main():
    yjn = Solution()
    # test of conflict
    print yjn.twoSum([5,6,7,7,8],15)# the next seven would cover the pre-seven



if __name__ == '__main__':
    main()