package com.kgb.basic

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/21/18.
 */
fun main(args: Array<String>) {
    val fib = generateSequence( 1 to 1, {
//        println(it.first)
        it.second to it.first + it.second}).map { it.first }
    val firstTen = fib.take(10).toList()
    val firstTwenty = fib.take(20).toList()

    val availableNums = generateSequence(3, {
        println(it)
        it + 2})
    availableNums.take(10).toList()

    val primeNum = generateSequence(2 to availableNums,
            {
                val p = it.second.first()
                val possiblePrimeAfterP = it.second.filter { it % p != 0 }
                p to possiblePrimeAfterP
            }).map { it.first }

    primeNum.take(10)
}