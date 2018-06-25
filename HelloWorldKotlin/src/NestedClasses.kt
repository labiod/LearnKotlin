/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 6/11/18.
 */

class Outer {
    val mString = "Outside nested class"

    inner class NestedClass {
        val newString = "Inside Nested Class"
        fun callInside() = "Function call from inside..."

        fun getStuff() = mString

    }
}

fun main(args: Array<String>) {
    val outer = Outer()

    println("Using Outer object: ${outer.NestedClass().getStuff()}")

    val inner = outer.NestedClass()
    println("Using inner Object: ${inner.getStuff()}")
}