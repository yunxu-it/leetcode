package test

import main.LC0069
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class LC0069Test {
    private lateinit var solution: LC0069


    @Before
    fun setUp() {
        solution = LC0069()
    }

    @Test
    fun sqrt() {
        Assert.assertEquals(4, solution.sqrt(16))
    }
}