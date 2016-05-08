#!/usr/bin/env python
# -*- coding: utf-8 -*-

#Python2.7.10 API charpter Nine Class
class Complex:
    """used attribute __doc__ to show this sentence"""
    def __init__(self, realpart,imagepart):
        self.r = realpart
        self.i = imagepart
    def f(self):
        return "YJN"

yjn = Complex(1,-2)
print yjn.r,yjn.i

# So, what's the difference?
print yjn.f         # 方法对象,其实是把实例对象作为函数的第一个self参数传了进去
print Complex.f(yjn)        # 函数对象

# 数据属性会覆盖同名的方法属性。 be careful!! it is a common BUG
class Bag:
    def __init__(self):
        self.data = []
    def add(self, x):
        self.data.append(x)
    def  addtwice(self, x):
        self.add(x)
        self.add(x)

aaa = Bag()
aaa.add(1)
aaa.addtwice(2)
print aaa.data

# 检查实例类型 isinstance(obj, int) 本质是看obj.__class__ is int ?
# 检查类继承 issubclass(bool, int)  return ture because bool is belong to int 
#            issubclass(unicode, str)  return false because they are using a same father basestring (class)

# 继承 深度优先 从左到右 单调不重复

class Mapping:
    def __init__(self, iterable):
        self.items_list = []
        self.__update(iterable)

    def update(self, iterable):
        for item in iterable:
            self.items_list.append(item)

    __update = update # private copy of method update is useful in test

class MappingSubclass(Mapping):
    """docstring for MappingSubclass"""

    def update(self, keys, values):
        for item in zip(keys, values):
            self.items_list.append(item)
        
qwer = [1,2,3]
asdf = Mapping(qwer)
print asdf.items_list

class B(Exception):
    pass

class C(B):
    pass

class D(C):
    pass
for cls in [B, C, D]:
    try:
        raise cls()
    except D:
        print "D"
    except C:
        print "C"        
    except B:
        print "B"
        # 顺序倒过来,print BBB, not BCD


