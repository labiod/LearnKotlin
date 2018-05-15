package com.kgb.oo

import java.util.*

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/15/18.
 */
val list: List<Int> = listOf(1, 2, 3)

class TimeSeries<T> {

    private val date2Data: MutableMap<Date, T> = mutableMapOf()
    fun add(element: T) {
        date2Data.put(Date(), element)
    }

    fun addAll(elements: Collection<T>) {
        elements.forEach { add(it) }
    }

    fun getLatest(): T {
        return date2Data.values.last()
    }
}

fun <T> timelineOf(vararg elements: T) : TimeSeries<T> {
    var result = TimeSeries<T>()
    for (elem in elements) {
        result.add(elem)
    }
    return result
}

fun main(args: Array<String>) {
    val timeSeries: TimeSeries<Int> = TimeSeries()
    timeSeries.add(2)
    timeSeries.getLatest()

    val timeSeries2: TimeSeries<Int> = timelineOf(1, 2, 3)

}