package com.kgb.oo

import java.awt.event.MouseAdapter
import java.awt.event.MouseEvent

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
}