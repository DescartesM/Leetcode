#!/usr/bin/env python
# -*- coding: utf-8 -*-
import math
def func(n):
    if n <= 0:
        return False
    x = math.log10(n)/math.log10(3)
    if x % 1 == 0:
        return True
    return False


def main():
    print func(0)
  #  print counts(A)

if __name__=="__main__":
    main()
