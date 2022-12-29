package com.example.demo.util

import org.junit.Assert.*

import org.junit.Test

class UtilitiesTest {

    @Test
    fun isPalindrome() {
        val result = Utilities.isPalindrome("level")
        assertEquals(true,result)
    }
}