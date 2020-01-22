package test

import main.LC0118
import org.hamcrest.Description
import org.hamcrest.Matcher
import org.junit.Assert
import org.junit.Before
import org.junit.Test

class LC0118Test {

    private lateinit var solution: LC0118


    @Before
    fun setUp() {
        solution = LC0118()
    }

    @Test
    fun generate() {
        val list = solution.generate(4)
        println(list)
    }
}