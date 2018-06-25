/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 6/8/18.
 */

fun String.removeFirstAndLastChar() : String = this.substring(1, this.length - 1)

fun main(args: Array<String>) {
    val fullName = "Paulo Dichone"
    val result = fullName.removeFirstAndLastChar()
    println ("First charactes are: $result")
    println("Hello Kotlin!")
}