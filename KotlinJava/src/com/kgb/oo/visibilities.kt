package com.kgb.oo

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/15/18.
 */

// private - same as in Java
// protected - same as in Java
// internal - visible inside the same module
// public - same as in Java (default visibility)

// in this case this means that i is visible only in this file
private val i = 42

private class Car(val brand: String, private val model: String) {
    fun tellMeYourModel() = model

}

fun main(args: Array<String>) {
    val car = Car("Brand", "Model")
    car.brand
    println(i)
}