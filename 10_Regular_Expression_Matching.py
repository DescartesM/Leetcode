#!/usr/bin/env python
# -*- coding: utf-8 -*-
import re
class Solution(object):
    def isMatch(self, s, p):
        """
        :type s: str
        :type p: str
        :rtype: bool
        """
        # i think it is the easyest way for me now, i will modify it in the future
        return re.match('^' + p + '$', s) is not None