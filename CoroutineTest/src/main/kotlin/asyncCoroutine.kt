import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.runBlocking

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 6/25/18.
 */
fun main(args: Array<String>) {
    val deferred = (1..1_000_000).map { n ->
        async {
            workload(n)
        }
    }

    runBlocking {
        val sum = deferred.sumBy { it.await() }
        println("Sum: $sum")
    }

}

suspend fun workload(n: Int): Int {
    delay(1000)
    return n
}