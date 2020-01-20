#!/usr/bin/env python
# encoding: utf-8

# Largest Number
#
# Given a list of non negative integers,
# arrange them such that they form the largest number.
# For example, given [3, 30, 34, 5, 9],
# the largest formed number is 9534330.
# Note: The result may be very large,
# so you need to return a string instead of an integer
class Solution:
    # @param num, a list of integers
    # @return a string
    
    def largestNumber(self, num):
        comp = lambda x,y: 1 if x+y > y+x else -1 if x+y < y+x  else 0
        num = list(map(str,num))
        num.sort(cmp= comp,reverse = True)
        return str(int(''.join(num)))





