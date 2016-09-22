#!/usr/bin/env python
# -*- coding: utf-8 -*-
__author__ = 'yjn'
import time
# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution(object):
    def isSameTree(self, p, q):
        """
        :type p: TreeNode
        :type q: TreeNode
        :rtype: bool
        """
        if (p == None and q != None):
            return False
        elif (p != None and q == None):
            return False
        elif (p==None and q==None):
            return True
        else:
            if (p.val != q.val):
                return False
            else:
                return self.isSameTree(p.left, q.left) and self.isSameTree(p.right, q.right)

def main():
    start = time.clock()
    yjn = Solution()
    print yjn.readBinaryWatch(5)
    print "%s sec" % (time.clock() - start )

if __name__ == '__main__': 
    main()
    