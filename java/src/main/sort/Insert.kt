package main.sort

class Insert {
    /**
     * 插入排序法
     * 把待排序的记录按其关键码值的大小逐个插入到一个已经排好序的有序序列中，直到所有的记录插入完为止，得到一个新的有序序列
     */
    fun sort(nums: IntArray) {
        for (i in 1 until nums.size) {
            if (nums[i - 1] > nums[i]) {
                val temp = nums[i]
                var j = i
                while (j > 0 && nums[j - 1] > temp) {
                    nums[j] = nums[j - 1]
                    j--
                }
                nums[j] = temp
            }
            println(nums.toList().toString())
        }
    }
}

fun main(args: Array<String>) {
    val insert = Insert()
    insert.sort(intArrayOf(2, 6, 5, 8, 4, 9, 1, 7, 3))
}