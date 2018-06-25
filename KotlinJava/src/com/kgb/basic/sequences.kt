package com.kgb.basic

import kotlin.system.measureTimeMillis

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/14/18.
 */
fun main(args: Array<String>) {
    val verylongLIst = (1..999999L).toList()

    var sum = 0L
    var lazySum = 0L

    val msNonLazy = measureTimeMillis {
        sum = verylongLIst
                .filter { it > 50 }
                .map { it * 2 }
                .take(1000)
                .sum()
    }

    val msLazy = measureTimeMillis {
        lazySum = verylongLIst
                .asSequence()
                .filter { it > 50 }
                .map { it * 2 }
                .take(1000)
                .sum()
    }
    println("sum: $sum")
    println("Non-lazy: $msNonLazy ms, Result: $sum")
    println("Lazy: $msLazy ms, Result: $lazySum")

    val seq = generateSequence(1, { it + 1})


    println(seq.take(10).toList())
    val fib = generateSequence(1 to 1, {it.second to it.first + it.second})
            .map { it.first }
    println("fib: " + fib.take(10).joinToString())
}