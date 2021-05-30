package com.jam.app

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class DummyTest{

    @Test
    internal fun dummyTest() {
        val testSubject = Dummy("Jam")

        assertEquals("Jam",testSubject.getDummyName())
    }
}