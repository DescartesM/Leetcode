#!/usr/bin/env python
# -*- coding: utf-8 -*-
class Solution(object):
    def lengthOfLongestSubstring(self, s):
        """
        :type s: str
        :rtype: int
        """
        # in case of bug
        if len(s) == 0:
            return 0
        # init the var
        hashmap = {}
        max_length = 0
        #i = 0 unnecessary
        j = 0

        for i in range(len(s)):
            # if catch a repeat char, move the mobile pointer,not save the temp value of max
            if s[i] in hashmap and j <=hashmap[s[i]]:
                j = hashmap[s[i]] + 1
            # normal situation
            else:
                max_length = max(max_length, i - j + 1)# judge which is longer
            #save the var into hashmap, continue map
            hashmap[s[i]] = i
        return max_length
def main():
    yjn = Solution()
    # unit test 
    # print yjn.lengthOfLongestSubstring('')
if __name__ == '__main__':
    main()