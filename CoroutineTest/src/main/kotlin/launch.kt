import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 6/25/18.
 */
fun main(args: Array<String>) {
    println("Start")
    launch {
        delay(1000)
        println("Hello")
    }

    Thread.sleep(2000)

    println("Stop")
}