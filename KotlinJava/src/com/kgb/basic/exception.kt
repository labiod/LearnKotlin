package com.kgb.basic

import java.io.IOException

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/11/18.
 */
fun main(args: Array<String>) {
    val input = try {
        getExternalInput()
    } catch (e : IOException) {
        e.printStackTrace()
        ""
    } finally {
        println("finished trying to read external input")
    }
    println(input)
}

fun getExternalInput(): String {
    throw IOException("Could not read external input")
}