package main

import kotlin.math.max
import kotlin.math.min

/**
 * https://leetcode-cn.com/problems/maximal-square/solution/
 * 使用动态规划解题
 */
class LC0221 {
    class Solution {
        fun maximalSquare(matrix: Array<CharArray>): Int {
            if (matrix.isEmpty()) {
                return 0
            }
            val rows = matrix.size
            val cols = if (matrix[0].isNotEmpty()) matrix[0].size else 0
            val dp = Array(rows + 1) { IntArray(cols + 1) }
            var maxLens = 0
            for (i in 1..rows) {
                for (j in 1..cols) {
                    if (matrix[i - 1][j - 1] == '1') {
                        dp[i][j] = min(min(dp[i - 1][j], dp[i][j - 1]), dp[i - 1][j - 1]) + 1
                        maxLens = max(maxLens, dp[i][j])
                    }
                }
            }
            return maxLens * maxLens
        }
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = Solution()
            print("result ${solution.maximalSquare(emptyArray())}")

        }
    }

}


