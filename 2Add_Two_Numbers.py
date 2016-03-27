#!/usr/bin/env python
# -*- coding: utf-8 -*-
class ListNode(object):
    def __init__(self, x):
        self.val = x
        self.next = None

def addTwoNumbers(l1, l2):
    carry = 0
    root = n = ListNode(0)
    while l1 or l2 or carry:
        v1 = v2 = 0
        if l1:
            v1 = l1.val
            l1 = l1.next
        if l2:
            v2 = l2.val
            l2 = l2.next
        carry, val = divmod(v1+v2+carry, 10)
        n.next = ListNode(val)
        n = n.next
    #print root.next.val
    #print root.next.next.val
    return root.next

def main():
    l1 = ListNode(2)
    l1.next = ListNode(1)
    l2 = ListNode(1)
    l2.next = ListNode(2)
    root = addTwoNumbers(l1,l2)
    while root != None:
        print root.val
        root = root.next


if __name__=="__main__":
    main()
