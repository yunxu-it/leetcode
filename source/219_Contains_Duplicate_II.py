#!/usr/bin/env python
# encoding: utf-8

class Solution:
    # @param {integer[]} nums
    # @param {integer} k
    # @return {boolean}
    def containsNearbyDuplicate(self, nums, k):
        if nums is None:
            return False

        coll = {}
        for i in range(len(nums)):
            if coll.get(nums[i]) is None:
                coll[nums[i]] = i
            else:
                if i - coll[nums[i]] <= k:
                    return True
                coll[nums[i]] = i
        return False
