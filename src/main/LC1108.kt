package main

import java.lang.StringBuilder
import java.util.*
import kotlin.math.log10


class LC1108 {
    class Solution {
        fun defangIPaddr(address: String): String {
            val sb = StringBuilder()
            for (i in address) {
                if (i == '.') {
                    sb.append("[.]")
                } else {
                    sb.append(i)
                }
            }
            return sb.toString()
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution()
            val time = Date().time
            solution.defangIPaddr("1.1.1.1").also { println(it) }
            solution.defangIPaddr("255.100.50.0").also { println(it) }
            println("\n耗时： ${Date().time - time} ms")
        }
    }

}


