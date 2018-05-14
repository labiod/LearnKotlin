package com.kgb.basic

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/14/18.
 */
inline fun modifyString(str: String, operation: (String) -> String): String {
    return operation(str)
}

fun main(args: Array<String>) {
    println (modifyString("Kotlin is amazing", { it.toUpperCase() }))
}