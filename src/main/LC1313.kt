package main

import java.util.*
import kotlin.math.max
import kotlin.math.min


class LC1313 {
    class Solution {
        fun decompressRLElist(nums: IntArray): IntArray {
            var length: Int = 0
            nums.forEachIndexed { index, i ->
                if (index % 2 == 0) {
                    length += i
                }
            }
            val result = IntArray(length)
            var index = 0
            for (i in nums.indices step 2) {
                for (j in 0 until nums[i]) {
                    result[index++] = nums[i + 1]
                }
            }
            return result
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution()
            val time = Date().time
            solution.decompressRLElist(intArrayOf(1, 2, 3, 4)).forEach { print("$it ") }
            println("\n耗时： ${Date().time - time} ms")
        }
    }

}


