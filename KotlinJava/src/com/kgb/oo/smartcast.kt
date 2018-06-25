package com.kgb.oo

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/15/18.
 */
fun Bicycle.replaceWheel() {
    println("Replacing wheel...")
}

fun Boat.startEngine(): Boolean {
    println("Starting engine...")
    return true
}
fun main(args: Array<String>) {
    val vehicle: Drivable = Bicycle()

    // instanceof <-> is
    if (vehicle is Bicycle) {
        vehicle.replaceWheel()
    } else if (vehicle is Boat) {
        vehicle.startEngine()
    }

    if (vehicle is Boat && vehicle.startEngine()) {
        // do something
    }

    if (vehicle !is Boat || vehicle.startEngine()) {
        // do something
    }

    if (vehicle !is Bicycle) {
        return
    }

    vehicle.replaceWheel()
}