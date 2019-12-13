package main.sort

class Insert {
    /**
     * 插入排序法
     * 在要排序的一组数中，选出最小（或最大）的一个数与第一个位置的数交换；在剩下的数当中找最小的与第二个位置的数交换，即顺序放在已排好序的数列的最后，如此循环，直到全部数据元素排完为止。
     */
    fun sort(nums: IntArray) {
        for (i in 1..nums.size - 1) {
            for (j in i - 1 downTo 0) {
                if (nums[j] < nums[j + 1]) {
                    Utils.exchange(nums, j, i)
                }
            }
            println(nums.toList().toString())
        }
    }
}

fun main(args: Array<String>) {
    val insert = Insert()
    insert.sort(intArrayOf(2, 6, 5, 8, 4, 9, 1, 7, 3))
}