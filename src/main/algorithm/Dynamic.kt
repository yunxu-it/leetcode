package main.algorithm

/**
 * 动态规划
 */
class Dynamic {


    fun cut(nums: IntArray, length: Int): Int {
        if (length == 0) {
            return 0
        }
        println("${nums.toList()} $length")
        var max = 0
        for (i in 0 until length) {
            max = maxOf(max, nums[i] + cut(nums, length - i - 1))
        }
        return max
    }

    fun buttom_up_cut(p: IntArray): List<Int> {
        val r = IntArray(p.size + 1)
        for (i in 1..p.size) {
            var q = -1
            for (j in 1..i) q = Math.max(q, p[j - 1] + r[i - j])
            r[i] = q
        }
        return r.toList()
    }


}

fun main(args: Array<String>) {
    /**
     * 钢管切割问题
     * https://blog.csdn.net/u013309870/article/details/75193592
     */
    val nums = intArrayOf(1, 5, 8, 9, 10, 117, 17, 20, 24, 30)
    val dynamic = Dynamic()
//    val result = dynamic.cut(nums, 4)
    val result = dynamic.buttom_up_cut(nums)
    print(result)

}