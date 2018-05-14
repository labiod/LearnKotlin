package com.kgb.basic

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/11/18.
 */
fun main(args: Array<String>) {
    val list = generateSequence(0) { it + 10}
    val first10 = list.take(10).toList()
    val withoutFirst900 = list.drop(900).toList()

    println(first10)
    println(withoutFirst900)
}