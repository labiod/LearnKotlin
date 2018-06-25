package com.kgb.oo

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/14/18.
 */
// data generates hashCode(), equals(), toString(), copy() and destructuring operator
data class Address(val street:String, val number: Int, val postCode: String, val city: String)

fun main(args: Array<String>) {
    val residence = Address("Main Street", 42, "1234", "New York")
    val residence2 = Address("Main Street", 42, "1234", "New York")

    println(residence)

    println(residence === residence2)
    println(residence == residence2)

    val neighbor = residence.copy(number = 43)

    println(neighbor)

    residence.component1()
    val (street, number, postCode, city) = residence
    println("$street $number, $postCode $city")
}