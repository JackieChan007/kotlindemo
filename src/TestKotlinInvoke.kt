package deemo

import java.lang.IllegalArgumentException

class kotlinExp {

    fun print() {
        println("hello kotlin")
//        throw IllegalArgumentException("非法请求参数" )
    }

    fun sumTwo(a: Int, b: Int): Int {
        val age = 3
        val num = 4
        val c = age + num
        var d = 4
        d = 5
        return a + b + c
    }
}