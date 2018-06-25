package com.kgb.oo

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/15/18.
 */
interface Drivable {
    fun drive() {
        println("driving (interface)")
    }
}

class Bicycle : Drivable {
    override fun drive() {
        println("driving bicycle")
    }
}

class Boat : Drivable {
    override fun drive() {
        println("Driving boat")
    }
}

fun main(args: Array<String>) {
    val drivable: Drivable = Bicycle()
    drivable.drive()
}


