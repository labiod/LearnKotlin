package com.kgb.basic

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/11/18.
 */
fun main(args: Array<String>) {
    val timesTwo = { x: Int -> x*2 }

    val add: (Int, Int) -> Int  = { x: Int, y: Int -> x + y }
    val list = (1..10).toList()

    //Filters function version
    println(list.filter({element -> element % 2 == 0 }))

    println(list.filter{ element -> element % 2 == 0 })

    println(list.filter({ it % 2 == 0 }))

    println(list.filter({ it.even() }))

    println(list.filter(::isIEven))
}

fun isIEven(i: Int) = i % 2 == 0

fun Int.even() = this % 2 == 0