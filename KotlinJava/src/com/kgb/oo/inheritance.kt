package com.kgb.oo

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/14/18.
 */
// Minimal example
open class Base
class Child : Base()

open class Shape1(val name: String) {

    open fun area() = 0.0
}

class Circle1(name: String, val radius: Double) : Shape1(name) {
    override fun area() = Math.PI * Math.pow(radius, 2.0)
}

fun main(args: Array<String>) {
    val smallCircle = Circle1("small circle", 2.0)

    println(smallCircle.name)
    println(smallCircle.radius)
    println(smallCircle.area())
}