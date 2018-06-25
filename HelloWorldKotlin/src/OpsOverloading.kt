/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 6/11/18.
 */


fun main(args: Array<String>) {
    val a = 3
    val b = 4

    val p1 = Point(10, -4)
    val p2 = Point(3, 8)
    val p3 = PointF(1F, 8F)

    var sum = p1 + p2
    var div = p1 - p2
    var mul = p1 * 5
    val p4 = p1 + p3
    val p5 = p3 + p1
    println("The sum = (${sum.x}, ${sum.y})")
    println("The div = (${div.x}, ${div.y})")
    println("The div = (${mul.x}, ${mul.y})")
}


class Point(val x: Int = 0, val y: Int = 12) {
    //Overload plus operator
    operator fun plus(p: Point): Point {
        return Point(x + p.x, y + p.y)
    }

    operator fun plus(p: PointF): PointF {
        return PointF(x + p.x, y + p.y)
    }

    operator fun minus(p: Point): Point {
        return Point(x - p.x, y - p.y)
    }

    operator fun minus(num: Int): Point {
        return Point(x - num, y - num)
    }

    operator fun times(num: Int): Point {
        return Point(x * num, y * num)
    }

}

class PointF(val x: Float = 0F, val y: Float = 12F) {
    //Overload plus operator
    operator fun plus(p: Point): PointF {
        return PointF(x + p.x, y + p.y)
    }

}