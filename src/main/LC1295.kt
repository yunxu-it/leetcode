package main

import java.util.*
import kotlin.math.log10


class LC1295 {
    class Solution {
        fun findNumbers(nums: IntArray): Int {
            var count = 0
            for (i in nums) {
                if ((log10(i.toDouble()) + 1).toInt() % 2 == 0) {
                    count++
                }
            }
            return count
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution()
            val time = Date().time
            solution.findNumbers(intArrayOf(12, 345, 2, 6, 7896)).also { println(it) }
            solution.findNumbers(intArrayOf(555, 901, 482, 1771)).also { println(it) }
            println("\n耗时： ${Date().time - time} ms")
        }
    }

}


