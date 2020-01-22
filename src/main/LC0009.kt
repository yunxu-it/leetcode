package main

import java.util.*


class LC0009 {
    class Solution {
        fun isPalindrome(x: Int): Boolean {
            if (x < 0 || (x % 10 == 0 && x != 0)) return false
            var temp = x
            var reverse = 0
            while (reverse < temp) {
                reverse = 10 * reverse + temp % 10
                temp /= 10
            }
            return temp == reverse || temp == reverse / 10
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution()
            val time = Date().time
            solution.isPalindrome(121).also { println(it) }
            solution.isPalindrome(-221).also { println(it) }
            solution.isPalindrome(1221).also { println(it) }
            println("\n耗时： ${Date().time - time} ms")
        }
    }

}


