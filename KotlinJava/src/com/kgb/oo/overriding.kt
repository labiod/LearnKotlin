package com.kgb.oo

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/15/18.
 */
abstract class Vehicle(open val brand: String = "") {
    open fun drive() {
        println("Driving")
    }
    abstract fun honk()
}

class Sedan(override var brand: String = "BRAND") : Vehicle(), Drivable {
    
    override fun honk() {
        println("Mððp")
    }

    override fun drive() {
        super<Drivable>.drive()
    }

}

fun main(args: Array<String>) {
    val sedan = Sedan()
    sedan.drive()
    sedan.honk()
}