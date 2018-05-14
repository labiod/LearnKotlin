package com.kgb.basic

import java.io.File

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/14/18.
 */
fun main(args: Array<String>) {
    // let()

    // Working with scoping
    File("example.txt").bufferedReader().let {
        if (it.ready()) {
            println(it.readLine())
        }
    }

    // reader should not be visible

    // Working with nullables
    val str: String? = "Kotlin for Android"
    str?.let {
        if (str.isNotEmpty()) {
            str.toLowerCase()
        }
    }
}