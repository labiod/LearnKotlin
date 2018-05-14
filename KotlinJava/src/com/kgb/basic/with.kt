package com.kgb.basic

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/14/18.
 */
fun main(args: Array<String>) {
    val props = System.getProperties()
    with(props) {
        list(System.out)
        println(propertyNames().toList())
        println(getProperty("user.home"))
    }


}