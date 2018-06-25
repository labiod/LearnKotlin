package com.kgb.basic

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/14/18.
 */
fun main(args: Array<String>) {

    val possiblePrimesAfter2 = generateSequence (3) { it + 2}
    val primes = generateSequence(2 to possiblePrimesAfter2) {
        // Next prime number
        val p = it.second.first()

        val possiblePrimeAfterP = it.second.filter { it % p != 0 }
        p to possiblePrimeAfterP
    }.map { it.first }

    println(primes.take(10).toList())
}