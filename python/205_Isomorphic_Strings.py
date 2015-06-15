#!/usr/bin/env python
# encoding: utf-8

class Solution:
    # @param {string} s
    # @param {string} t
    # @return {boolean}
    def isIsomorphic(self, s, t):
        if len(s) != len(t):
            return False
        k = 0
        sd , td = set(),set()
        for i in xrange(len(s)):
            if not s[i] in sd and t[i] in td:
                s.replace(s[i],k)
                t.replace(t[i],k)
                sd |= s[i]
                td |= t[i]


