package main.sort

class Selection {
    /**
     * 选择排序法
     * 在要排序的一组数中，选出最小（或最大）的一个数与第一个位置的数交换；在剩下的数当中找最小的与第二个位置的数交换，即顺序放在已排好序的数列的最后，如此循环，直到全部数据元素排完为止。
     */
    fun sort(nums: IntArray) {
        for (i in nums.indices) {
            var index = i
            for (j in i until nums.size) {
                if (nums[j] < nums[index]) {
                    index = j
                }
            }
            if (index != i) {
                Utils.exchange(nums, index, i)
            }
            println(nums.toList().toString())
        }
    }
}

fun main(args: Array<String>) {
    val select = Selection()
    select.sort(intArrayOf(3, 6, 2, 5, 4, 7, 9, 8, 1))
}