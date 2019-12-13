import java.util.ArrayList

/**
 * Date: 2017/10/8
 * Origin: https://leetcode.com/problems/pascals-triangle/description/
 */
class LC0118 {
    fun generate(numRows: Int): List<List<Int>> {
        val allRows = ArrayList<List<Int>>()
        for (i in 1..numRows) {
            if (i == 1) {
                val row = ArrayList<Int>()
                row.add(1)
                allRows.add(row)
                continue
            }
            if (i == 2) {
                val row = ArrayList<Int>()
                row.add(1)
                row.add(1)
                allRows.add(row)
                continue
            }
            val last_row = allRows[allRows.size - 1]
            val row = ArrayList<Int>()
            row.add(1)
            for (j in 1 until last_row.size) {
                row.add(last_row[j - 1] + last_row[j])
            }
            row.add(1)
            allRows.add(row)
        }

        return allRows
    }


    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(LC0118().generate(5))
        }
    }
}
