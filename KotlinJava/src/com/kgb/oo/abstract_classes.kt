package com.kgb.oo

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/15/18.
 */
abstract class Shape(val name: String) {
    abstract fun area(): Double
}

class Circle(name: String, val radius: Double) : Shape(name) {
    override fun area(): Double = Math.PI * Math.pow(radius, 2.0)
}

fun main(args: Array<String>) {
    val shape = Circle("Large circle", 17.0)
    println(shape.area())
}
