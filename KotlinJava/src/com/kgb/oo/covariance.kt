package com.kgb.oo

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/15/18.
 */
open class Being
open class Person : Being()
class Student : Person()

fun main(args: Array<String>) {
    val people: MutableList<Person> = mutableListOf(Person(), Person())
    people.add(Student())

    val p: Person = Student() // covariance

    // Read-only collection are covariant
    val students: List<Person> = listOf<Student>()
    //this is imposible when you use mutable collections
    //val students2: MutableList<Person> = mutableListOf<Student>()

    // Using Kotlin
    val events: TimeSeries<Person> = timelineOf()
    val students3: List<Student> = listOf(Student(), Student())
    events.addAll(students3)

    // Using Java TimeSeries
    val chartData: JavaTimeSeries<Person> = JavaTimeSeries()
    chartData.add(Student())
    chartData.addAll(students3)

}