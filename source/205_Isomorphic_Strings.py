#!/usr/bin/env python
# encoding: utf-8

class Solution:
    # @param {string} s
    # @param {string} t
    # @return {boolean}

    #By mathsam
    #https://leetcode.com/discuss/36438/1-liner-in-python
    def isIsomorphic(self, s, t):
        return list(map(s.find,s)) == list(map(t.find,t))

s = Solution()
print(s.isIsomorphic("ab","ca"))
