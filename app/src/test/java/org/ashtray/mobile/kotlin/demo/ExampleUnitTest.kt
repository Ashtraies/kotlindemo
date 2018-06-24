package org.ashtray.mobile.kotlin.demo

import org.junit.Assert.assertEquals
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    @Test
    fun addition_isCorrect() {
        //TODO whats up
        assertEquals(4, 2 + 2)
    }

    class A {

        fun hello(name : String) {
            print("Hello ${name}")
        }
    }
}
