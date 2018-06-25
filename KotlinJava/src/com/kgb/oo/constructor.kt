package com.kgb.oo

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/14/18.
 */
class Country(val name: String, val areaSqKm: Int) {
    constructor(name: String): this(name, 0) {
        println("Constructor called")
    }
    fun print() = "$name, $areaSqKm km^2"
}

fun main(args: Array<String>) {
    val australia = Country("Australia", 7_700_000)

    println(australia.name)
    println(australia.areaSqKm)
    australia.print()

    val spain = Country("Spain")
    println(spain.name)
    println(spain.areaSqKm)
}