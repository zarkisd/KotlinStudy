package chap03.section5

fun main() {
    var number1=5




    println("Factorial : $number1 -> ${factorial1(number1)}")
}

tailrec fun factorial1(n:Int, run:Int=1):Long {

    return if(n==1)run.toLong() else factorial1(n-1, run*n)

}