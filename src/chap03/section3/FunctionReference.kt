package chap03.section3

fun main() {
val res1= funcParam(3,2,::sum1)
    println(res1)

    hello(::text)

    val likeLambda=::sum

    println(likeLambda(6,6))
}

fun sum1(a: Int, b: Int) = a + b

fun text(a: String, b: String) = "Hi! $a $b"

fun funcParam(a:Int, b:Int, c:(Int, Int)->Int):Int{
    return c(a,b)
}

fun hello(body :(String, String)-> String):Unit{
    println(body("Hello", "World"))

}