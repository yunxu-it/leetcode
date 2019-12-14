package main.sort

class Quick {
    /**
     * 插入排序法
     * 把待排序的记录按其关键码值的大小逐个插入到一个已经排好序的有序序列中，直到所有的记录插入完为止，得到一个新的有序序列
     */
    fun sort(nums: IntArray) {
        var i = 0
        var j = nums.size - 1
        val temp = nums[i]
        while (i < j) {
            while (nums[j] > temp) {
                j--
            }
            if (i < j) {
                nums[i] = nums[j]
            }

            while (nums[i] <= temp) {
                i++
            }
            if (i < j) {
                nums[j] = nums[i]
            }
        }
        nums[i] = temp
        println(nums.toList().toString())
    }
}

fun main() {
    val quick = Quick()
    quick.sort(intArrayOf(2, 6, 5, 8, 4, 9, 1, 7, 3))
}