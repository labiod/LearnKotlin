package com.kgb.basic

import java.util.*

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/11/18.
 */
val PI = 3.1415

fun main(args: Array<String>) {
//    println("Please enter your name :")
//    var name : String = readLine() ?: ""
//    if (name.length > 0) {
//        println("your name is $name")
//    } else {
//        println("you put empty name")
//    }

    val rand = Random()

    var randomList = mutableListOf<Int>()
    for (i in 1..100) {
        randomList.add(rand.nextInt(100) + 1)
    }

    var i = 0
    while (i < randomList.size && randomList[i] > 10) {
        println(randomList[i++])
    }
}