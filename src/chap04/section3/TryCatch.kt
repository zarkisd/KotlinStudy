package chap04.section3

import java.lang.Exception

fun main() {
    val a=6
    val b=0
    val c:Int
    try {
        c=a/b
    }
    catch (e : Exception){
        println("Exception is handled.")
        println(e.message)
        e.printStackTrace()
    }
    finally {
        println("finally는 반드시 실행")
    }
}