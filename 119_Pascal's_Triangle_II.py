#!/usr/bin/env python
# -*- coding: utf-8 -*-
class Solution(object):
    def getRow(self, rowIndex):
        """
        :type rowIndex: int
        :rtype: List[int]
        juanji sixiang
        """
        row =[1]
        if rowIndex <= 0:
            return row
        for i in range(1,rowIndex+1):
            row = list(map(lambda x,y: x+y, [0]+row,row+[0]))
        return row
            