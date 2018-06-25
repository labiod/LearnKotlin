package com.kgb.basic

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/14/18.
 */
fun main(args: Array<String>) {
    val list = listOf("Hi", "there", "Kotlin", "fans")
    val containsT = listOf(false, true, true, false)

    //Pair<String, Boolean>
    val ziplist: List<Pair<String, Boolean>> = list.zip(containsT)

    val mapping = list.zip(list.map { it.contains("t") })

    println(ziplist)
    println(mapping)

    val data = mapOf(
            "users1.csv" to listOf(32, 45, 17, -1, 34),
            "users2.csv" to listOf(19, -1, 67, 22),
            "users3.csv" to listOf(),
            "users4.csv" to listOf(56, 32, 18, 44)
    )
    println("map:")
    println(data)
    val avgmap = data.flatMap { it.value }
            .filter { it >= 0 }
            .average()

    val faultyData = data.filter { it.value.any {it < 0} }
            .map { it.key }

    val numberOfFaults = data.flatMap { it.value }
            .filter { it < 0 }
            .count()

    println("Users average %.2f years of age.".format(avgmap))
    println("Files with faulty data: $faultyData")
    println("There were $numberOfFaults errors in the data.")
}