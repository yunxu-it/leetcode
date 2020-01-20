#!/usr/bin/env python
# encoding: utf-8

class Solution:
    def trailingZeroes(self,n):
        # x = 5
        ans = 0
        while n :
            ans += n/5
            n /= 5
        return ans
