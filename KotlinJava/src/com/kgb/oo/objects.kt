package com.kgb.oo

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent
import com.kgb.oo.House.Companion.getNormalHouse as createHouse
import com.kgb.oo.House.Companion.getLuxuryHouse

import com.kgb.basic.PI
import com.kgb.basic.getExternalInput

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/15/18.
 */


object CountryFactory {
    val a = 4
    fun createCountry() = Country("Australia")
}

object DefaultClickListener : MouseAdapter() {
    override fun mouseClicked(e: MouseEvent?) {
        println("Mouse was clicked")
    }
}

fun main(args: Array<String>) {
    CountryFactory.a
    CountryFactory.createCountry()
    createHouse()
    getLuxuryHouse()
}