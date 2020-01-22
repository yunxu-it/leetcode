import main.LC1313
import org.junit.Assert

class LC1313Test {
    private lateinit var solution: LC1313.Solution

    @org.junit.Before
    fun setUp() {
        solution = LC1313.Solution()
    }

    @org.junit.Test
    fun twoSum() {
        Assert.assertArrayEquals(intArrayOf(2, 4, 4, 4), solution.decompressRLElist(intArrayOf(1, 2, 3, 4)))
    }
}