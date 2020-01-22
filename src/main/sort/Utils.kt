package main.sort

object Utils {
    fun exchange(nums: IntArray, index: Int, i: Int) {
        val temp = nums[index]
        nums[index] = nums[i]
        nums[i] = temp
    }
}