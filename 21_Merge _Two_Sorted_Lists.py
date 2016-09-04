#!/usr/bin/env python
# -*- coding: utf-8 -*-
__author__ = 'yjn'
import time
# Merge two sorted linked lists and return it as a new list. The new list should be made by splicing together the nodes of the first two lists.
# Definition for singly-linked list.
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

class Solution(object):
    def mergeTwoLists(self, l1, l2):
        """
        :type l1: ListNode
        :type l2: ListNode
        :rtype: ListNode
        """
        if l1 == None:
            return l2
        if l2 == None:
            return l1

        dummyhead = ListNode(0)
        dummyhead.next = None
        p = dummyhead
        while l1 is not None and l2 is not None:
            if l1.val > l2.val:
                p.next = l2
                l2 = l2.next
            else:
                p.next = l1
                l1 = l1.next
            p = p.next
            # print p.val
        if not l2:
            p.next = l1
        else:
            p.next = l2
        return dummyhead.next


def main():
    start = time.clock()
    yjn = Solution()
    l1 = ListNode(1)
    l1.next = ListNode(4)
    l2 = ListNode(2)
    l2.next = ListNode(3)
    print yjn.mergeTwoLists(l1, l2)
    print "%s sec" % (time.clock() - start )

if __name__ == '__main__': 
    main()
    