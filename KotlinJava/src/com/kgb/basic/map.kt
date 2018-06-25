package com.kgb.basic

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/11/18.
 */
fun main(args: Array<String>) {
    // map()
    val list = (1..100).toList()
    val doubled = list.map { element -> element * 2 }
    println(doubled)

    val average = list.average()
    val shifted = list.map {it - average}

    println(shifted)

    //flatMap()
    var nestedList = listOf(
            (1..10).toList(),
            (11..20).toList(),
            (21..30).toList()
    )

    var notFlattened = nestedList.map { it.sortedDescending() }

    var flattened = nestedList.flatMap { it.sortedDescending() }

    println(notFlattened)
    println(flattened)
}