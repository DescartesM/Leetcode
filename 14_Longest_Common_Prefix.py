#!/usr/bin/env python
# -*- coding: utf-8 -*-
class Solution:
    def longestCommonPrefix(self, strs):
        """
        :type strs: List[str]
        :rtype: str
        """
        if not strs:
            return ""
        # amazing use of zip(*List[]) to push the first letter into one tuple
        #[('1','1','1'),]
        for i, letter_group in enumerate(zip(*strs)):
            # if differ char set qu chong
            if len(set(letter_group)) > 1:
                return strs[0][:i]   
        else:
            return min(strs)


4
def main():
    yjn = Solution()
    print yjn.longestCommonPrefix(["123","12342","1234"])
if __name__ == '__main__':
    main()