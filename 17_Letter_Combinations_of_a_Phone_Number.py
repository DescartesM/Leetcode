#!/usr/bin/env python
# -*- coding: utf-8 -*-
class Solution(object):
    def letterCombinations(self, digits):
        """
        :type digits: str
        :rtype: List[str]
        """
        if len(digits) == 0:
            return []
        def func(digits, strings, d):
            if len(digits) == 0:
                return strings
            letters = d[digits[0]]
            new_string = []
            for letter in letters:
                for i in range(len(strings)):
                    new_string.append(strings[i] + letter)
            return func(digits[1:],new_string,d)
        d = {}
        d["0"] = d["1"] = ""
        d["2"] = "abc"
        d["3"] = "def"
        d["4"] = "ghi"
        d["5"] = "jkl"
        d["6"] = "mno"
        d["7"] = "pqrs"
        d["8"] = "tuv"
        d["9"] = "wxyz"
        return func(digits, [''], d)



def main():
    yjn = Solution()
    print yjn.letterCombinations('')
if __name__ == '__main__':
    import time
    start = time.clock()
    main()
    print "%s sec" % (time.clock() - start )