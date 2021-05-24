package chap04.section1

fun main() {
    var a = 12
    var b = 7
    val max = if (a > b) {

        println("a 선택")
        a
    } else {
        println("b 선택")
        b
    }
    println(max)
}

