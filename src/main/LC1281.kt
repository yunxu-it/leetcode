package main

import java.util.*
import kotlin.math.log10


class LC1281 {
    class Solution {
        fun subtractProductAndSum(n: Int): Int {
            var accumulate = 1
            var sum = 0
            var temp = n
            while (temp > 0) {
                val pop = temp % 10
                accumulate *= pop
                sum += pop
                temp /= 10
            }
            return accumulate - sum
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution()
            val time = Date().time
            solution.subtractProductAndSum(7896).also { println(it) }
            solution.subtractProductAndSum(482).also { println(it) }
            solution.subtractProductAndSum(234).also { println(it) }
            solution.subtractProductAndSum(4421).also { println(it) }
            println("\n耗时： ${Date().time - time} ms")
        }
    }

}


