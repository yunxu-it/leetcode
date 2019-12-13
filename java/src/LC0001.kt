import java.util.Arrays

class LC0001 {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        var a: Int
        for (i in nums.indices) {
            a = nums[i]
            for (j in i + 1 until nums.size) {
                if (a + nums[j] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf(0, 0)
    }

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val solution = LC0001()
            println(solution.twoSum(intArrayOf(3, 2, 4), 6).contentToString())
        }
    }
}