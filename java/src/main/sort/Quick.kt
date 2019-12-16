package main.sort

class Quick {
    private var nums = intArrayOf()
    /**
     * 快速排序法
     */
    fun sort(nums: IntArray) {
        this.nums = nums
        quickSort(0, nums.size - 1)
    }

    private fun quickSort(index: Int, length: Int) {
        if (index >= length) {
            return
        }
        val temp = nums[index]
        var i = index
        var j = length
        while (i != j) {
            while (nums[j] >= temp && i < j) {
                j--
            }
            while (nums[i] <= temp && i < j) {
                i++
            }
            if (i < j) {
                Utils.exchange(nums, i, j)
            }
        }
        nums[index] = nums[i]
        nums[i] = temp
        println("当前数列：${nums.toList()}")
        quickSort(index, i - 1)
        quickSort(j + 1, length)
    }
}

fun main(args: Array<String>) {
    val quick = Quick()
    quick.sort(intArrayOf(2, 6, 5, 8, 4, 9, 1, 7, 3))
}