package main

import java.util.*
import kotlin.math.log10


class LC0771 {
    class Solution {
        fun numJewelsInStones(J: String, S: String): Int {
            val hashSet = J.toHashSet()
            var count = 0
            for (s in S) {
                if (hashSet.contains(s)) {
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
            solution.numJewelsInStones("aA", "aAAbbbb").also { println(it) }
            solution.numJewelsInStones("z", "ZZ").also { println(it) }
            println("\n耗时： ${Date().time - time} ms")
        }
    }

}


