package com.kgb.oo

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/15/18.
 */
interface HouseFactory {
    fun createHouse(): House
}

class House(val numberOfRooms: Int, val price:Double) {
    // the same like static in java
    companion object : HouseFactory {
        override fun createHouse() = getNormalHouse()

        val HOUSES_FOR_SALE = 10
        fun getNormalHouse() = House(6, 199_999.0)
        fun getLuxuryHouse() = House(42, 7_000_000.0)
    }
}

fun main(args: Array<String>) {
    val normalHouse = House.getNormalHouse()
    println(normalHouse.price)
    println(House.HOUSES_FOR_SALE)
}