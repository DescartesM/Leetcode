#!/usr/bin/env python
# -*- coding: utf-8 -*-
__author__ = 'yjn'
import time
# Definition for singly-linked list.
# Given a linked list, swap every two adjacent nodes and return its head.
# Given 1->2->3->4, you should return the list as 2->1->4->3.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def swapPairs(self, head):
        pre, pre.next = self, head
        while pre.next and pre.next.next:
            a = pre.next
            b = a.next
            pre.next, b.next, a.next = b, a, b.next
            pre = a
            # print b.val
            # print pre.val
        return self.next

def main():
    start = time.clock()
    yjn = Solution()
    l1 = ListNode(4)
    l1.next = ListNode(3)
    l1.next.next = ListNode(2)
    l1.next.next.next = ListNode(1)
    yjn.swapPairs(l1)
    print "%s sec" % (time.clock() - start )

if __name__ == '__main__': 
    main()
    