package chap03.section1

fun main() {

    var result1=sum(3,2)
    var result2=sum(6,7)
    println("result1 : $result1")
    println("result2 : $result2")
}

fun sum(a: Int, b: Int): Int {

    var sum = a + b
    return sum

}
