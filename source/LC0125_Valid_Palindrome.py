#!/usr/bin/env python
# encoding: utf-8

import re


class Solution:
    # @param s, a string
    # @return a boolean
    def isPalindrome(self, s):
        s = s.lower()
        l = re.findall(r'[\w]', s)
        for i in range(len(l) // 2):
            if not (l[i] == l[-1 - i]):
                return False
        return True
