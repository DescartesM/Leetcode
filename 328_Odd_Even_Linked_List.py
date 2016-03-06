#!/usr/bin/env python
# -*- coding: utf-8 -*-


def oddEvenList(self, head):
    # at least three nodes or return as before
    if head == None or head.next == None or head.next.next == None:
        return head

    evenHead = head.next
    Oddlist = head # jishu node
    Evenlist = evenHead # oushu node
    cur = evenHead.next # temp var
    # firstly , node these odd nodes
    while cur != None:
        Oddlist.next = cur
        Oddlist = cur
        cur = cur.next
        # then node the remain even nodes. line up as before
        if cur != None: # INCASE OF 123
            Evenlist.next = cur
            Evenlist = cur
            cur = cur.next
            # shanhou
            Oddlist.next = evenHead # node the odd list and the even list
            Evenlist.next = None # bihuan

    return head



def main():

if __name__ == '__main__':
    main()