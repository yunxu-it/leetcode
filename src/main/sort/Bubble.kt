package main.sort

class Bubble {
    /**
     * 冒泡排序法
     * 比较相邻的元素。如果第一个比第二个大，就交换他们两个。
     * 对每一对相邻元素做同样的工作，从开始第一对到结尾的最后一对。在这一点，最后的元素应该会是最大的数。
     * 针对所有的元素重复以上的步骤，除了最后一个。
     * 持续每次对越来越少的元素重复上面的步骤，直到没有任何一对数字需要比较。
     */
    fun sort(nums: IntArray) {
        for (i in nums.indices) {
            for (j in 0 until nums.size - 1 - i) {
                if (nums[j] > nums[j + 1]) {
                    val temp = nums[j + 1]
                    nums[j + 1] = nums[j]
                    nums[j] = temp
                }
            }
            println(nums.toList().toString())
        }
    }
}

fun main(args: Array<String>) {
    val bubble = Bubble()
    bubble.sort(intArrayOf(3, 6, 2, 5, 4, 7, 9, 8, 1))
}