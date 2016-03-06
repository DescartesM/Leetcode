#!/usr/bin/env python
# -*- coding: utf-8 -*-

class Solution(object):
    def compareVersion(self, version1, version2):
        """
        :type version1: str
        :type version2: str
        :rtype: int
        """
        tuple1 = version1.split('.')
        tuple2 = version2.split('.')
        n1 = len(tuple1)
        n2 = len(tuple2)
        if len(tuple1) >= len(tuple2):
            tuple2.extend('0'*(len(tuple1)-len(tuple2)))
        else:
            tuple1.extend('0'*(len(tuple2)-len(tuple1)))
        i = 0
        while i < n1 or i < n2:
            if int(tuple1[i]) > int(tuple2[i]):
                return 1
            elif int(tuple1[i]) < int(tuple2[i]):
                return -1
            elif int(tuple1[i]) == int(tuple2[i]):
                i += 1
        return 0
tutu = Solution()
print tutu.compareVersion("1","1.1")

