package test

import main.LC0001
import org.junit.Assert

class LC0001Test {
    private lateinit var solution: LC0001

    @org.junit.Before
    fun setUp() {
        solution = LC0001()
    }

    @org.junit.Test
    fun twoSum() {
        Assert.assertArrayEquals(intArrayOf(1, 2), solution.twoSum(intArrayOf(3, 2, 4), 6))
    }
}