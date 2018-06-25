package com.kgb.oo

/**
 * @author Krzysztof Betlej <labiod@wp.pl>
 * Date: 5/15/18.
 */
class Source<out T>(private val t: T) {
    fun produceT(): T {
        return t
    }
}

class Sink<in T> {
    fun consumeT(t: T) {
        
    }
}
fun main(args: Array<String>) {
    val strSource: Source<String> = Source("Producer")
    val anySource: Source<Any> = strSource // out -> contravariance
    anySource.produceT()
    
    val anySink: Sink<Any> = Sink()
    val strSink: Sink<String> = anySink // in -> contravariance
    strSink.consumeT("Consumer")



}