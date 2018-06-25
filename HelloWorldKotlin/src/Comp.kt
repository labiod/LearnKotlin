/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 6/11/18.
 */

interface HasHaveInterface {
    infix fun has(name: String): Boolean
}

class Thing(val name: String): HasHaveInterface {
    infix override fun has(name: String): Boolean = this.name == name

}

class Person(val name: String) : HasHaveInterface {
    infix override fun has(name: String): Boolean = this.name == name


    infix fun s(thing: Thing): Thing = thing

}
fun main(args: Array<String>) {

    val paulo = Person("Paulo")
    val dog = Thing("Azor")
    val name = "Paulo"
    val otherName = "Azor"
    val result = paulo has name and (paulo s dog has otherName )
}