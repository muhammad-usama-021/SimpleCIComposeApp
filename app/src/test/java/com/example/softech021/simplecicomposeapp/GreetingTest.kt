package com.example.softech021.simplecicomposeapp

import org.junit.Test
import org.junit.Assert.*

class GreetingTest {
    @Test
    fun testGreeting() {
        val name = "Android"
        assertEquals("Hello Android!", "Hello $name!")
    }
}