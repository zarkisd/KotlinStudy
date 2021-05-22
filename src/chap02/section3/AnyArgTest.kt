package chap02.section3

fun main() {
    checkArg("Hello")
    checkArg(5)
}

fun checkArg(x:Any){
    if(x is String){
        println("X is String : $x")
    }
    else if(x is Int){
        println("x is Int : $x")

    }



}