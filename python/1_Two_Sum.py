# encoding: utf-8
from time import time


class Solution:
    # @param {integer[]} nums
    # @param {integer} target
    # @return {integer[]}

    def twoSum(self, nums, target):
        visited = []
        for flag, num in enumerate(nums):
            visited.append(num)
            if (target - num) in visited:
                i = visited.index(target - num)
                if i < flag:
                    return [i + 1, flag + 1]


t = time()
nums = [i for i in xrange(32044)]
target = 16021
S = Solution()
print  S.twoSum(nums, target)
print time() - t
