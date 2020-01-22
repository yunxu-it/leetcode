package main

import java.util.*

/**
 * https://leetcode-cn.com/problems/3sum/
 */
class LC0015 {
    class Solution {
        fun threeSum(nums: IntArray): List<List<Int>> {
            if (nums.size < 3) {
                return emptyList()
            }
            val length = nums.size
            val res: MutableList<List<Int>> = mutableListOf()
            val sorted = nums.sorted()
            for (i in sorted.indices) {
                if (sorted[i] > 0) break
                if ((i > 0) && (sorted[i] == sorted[i - 1])) continue
                var left = i + 1
                var right = length - 1
                while (left < right) {
                    when {
                        sorted[i] + sorted[left] + sorted[right] == 0 -> {
                            res.add(listOf(sorted[i], sorted[left], sorted[right]))
                            while (left < right && sorted[left] == sorted[left + 1]) {
                                left += 1
                            }
                            while (left < right && sorted[right] == sorted[right - 1]) {
                                right -= 1
                            }
                            left += 1
                            right -= 1
                        }
                        sorted[i] + sorted[left] + sorted[right] > 0 -> {
                            right -= 1
                        }
                        else -> {
                            left += 1
                        }
                    }
                }
            }
            return res.toList()
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution()
            val time = Date().time
            solution.threeSum(intArrayOf(-1, 0, 1, 2, -1, -4)).forEach { print("$it ") }
            solution.threeSum(intArrayOf(0, 0, 0, 0, 0, 0)).forEach { print("$it ") }
            println("\n耗时： ${Date().time - time} ms")
        }
    }

}


