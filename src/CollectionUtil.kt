/**
 * Created with IntelliJ IDEA.
 * User: JackieChan
 * Date: 2019/9/17
 * Time: 13:25
 * Copyright (c) ** All Rights Reserved
 * Description:
 */

fun testList() {
    var list = mutableListOf<String>("one", "one", "two")
    list.add("three")
    println(list)
    //mutalble set可以增删改查数据
    var set = mutableSetOf<String>("one", "one", "two")
    set.add("two")
    println(set)
    var plainList = listOf<String>("one", "two")
    println(plainList.first())
    println("***********listof**********")
    println(plainList)
    var plainSet= setOf<String>("oneSet","twoSet")
    println(plainSet)
    val numbersMap = mapOf("key1" to 1, "key2" to 2, "key3" to 3, "key4" to 1)
}


fun main() {
    testList()
}