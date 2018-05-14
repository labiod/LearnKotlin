package com.kgb.oo

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/14/18.
 */
class Robot(val name: String) {
    fun greetHuman() {
        println("Hello Human my name is $name")
    }

    fun knowsItsName(): Boolean = name.isNotBlank()
}

fun main(args: Array<String>) {
    val fightRobot = Robot("Destroyer9000")
    if (fightRobot.knowsItsName()) {
        fightRobot.greetHuman()
    }
}