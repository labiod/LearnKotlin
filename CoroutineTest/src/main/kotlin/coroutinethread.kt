import kotlinx.coroutines.experimental.launch
import java.util.concurrent.atomic.AtomicInteger

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 6/25/18.
 */
fun main(args: Array<String>) {
    val c = AtomicInteger()

    for (i in 1..1_000_000)
        launch {
            c.addAndGet(i)
        }

    println(c.get())
}