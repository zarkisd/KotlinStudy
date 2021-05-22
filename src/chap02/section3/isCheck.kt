package chap02.section3

fun main() {
    val num=256


    if (num is Int){
        println(num)
    }
    else if (num !is Int){
        print("Not a Int")
    }



    val x:Any
    x="Hello"
    if(x is String){
        print(x.length)
    }


    var y= 12
    val x1:String? =y as? String

}