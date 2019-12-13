package main

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
}