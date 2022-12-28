package com.example.demo.util

import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.runners.Parameterized

@RunWith(value = Parameterized::class)
class ParameterizedPalindrome(val inputString: String, val expectedValue: Boolean) {


    @Test
    fun test() {
        val result = Utilities.isPalindrome(inputString)
        Assert.assertEquals(expectedValue, result)
    }

    companion object {

        @JvmStatic
        @Parameterized.Parameters(name = "{0}")
        fun data(): List<Array<Any>> {
            return listOf(
                arrayOf("level", true),
                arrayOf("hello", false),
                arrayOf("a", true),
                arrayOf("", true)
            )
        }


    }


}