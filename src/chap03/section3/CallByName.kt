package chap03.section3

fun main() {
    val result= callByName(Otherlambda)
    println(result)
}

fun callByName(b:()->Boolean):Boolean{

    println("callByName function")
    return b()
}
val Otherlambda:()->Boolean={
    println("Oatherlambda function")
    true
}