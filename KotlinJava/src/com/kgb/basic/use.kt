package com.kgb.basic

import java.io.FileReader

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/14/18.
 */
fun main(args: Array<String>) {
    FileReader("mayexist.txt").use {
        val str = it.readText()
        println(str)
    }
}