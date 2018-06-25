import java.util.concurrent.atomic.AtomicInteger
import kotlin.concurrent.thread

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 6/25/18.
 */
fun main(args: Array<String>) {
    val c = AtomicInteger()

    for (i in 1..1_000_000)
        thread(start = true) {
            c.addAndGet(i)
        }

    println(c.get())
}