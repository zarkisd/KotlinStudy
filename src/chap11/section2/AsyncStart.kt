package chap11.section2


import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

suspend fun do1Work1(): String {
    delay(1000)
    return "Work1"
}

suspend fun do2Work2(): String {
    delay(3000)
    return "Work2"
}

suspend fun main() = runBlocking {

    val time = measureTimeMillis {
        val one = async(start = CoroutineStart.LAZY) { doWork1() }
        val two = async(start = CoroutineStart.LAZY) { doWork2() }
        println("AWAIT: ${one.await() + "_" + two.await()}")
    }
    println("Completed in $time ms")

    launch(Dispatchers.Default) {

    }

    async(Dispatchers.Default) {

    }

}.await()