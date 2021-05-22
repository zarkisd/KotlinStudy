package chap02.section2

fun main() {
    val number=10
    var language="Korean"
    val secondNumber:Int=20
    language="English"

    println("number : $number")
    println("language : $language")
println("secondNumber : $secondNumber")

    var num05=127
    var num06=-32768
    var num07= 2147483647
    var num08 = 9223372036854775807
    val exp01=123
    val exp02=123L
    val exp03=0x0F
    val exp08:Byte=127
    val exp09=32767
    val exp10:Short=32767

    val uint:UInt=153u
    val ushort:UShort=65535u
    val ulong:ULong=46322342uL
    val ubyte:UByte=255u

    val number01=1_000_000

println("number01에 _해도 그냥 나옴 : $number01")


    println("Byte min : ${Byte.MIN_VALUE} max : ${Byte.MAX_VALUE}")
    println("Short min : ${Short.MIN_VALUE} max : ${Short.MAX_VALUE}")
    println("Int min : ${Int.MIN_VALUE} max : ${Int.MAX_VALUE}")
    println("Long min : ${Long.MIN_VALUE} max : ${Long.MAX_VALUE}")
        println("Float min : ${Float.MIN_VALUE} max : ${Float.MAX_VALUE}")
    println("Double min : ${Double.MIN_VALUE} max : ${Double.MAX_VALUE}")

    val isOpen=true
    val isUploaded:Boolean

    val code :Int=65
    val chFromCode:Char=code.toChar()
    println("chFromCode : $chFromCode")

    var str1:String="Hello"
    var str2="World"
    var str3 = "Hello"

    println("str=== str2 : ${str1===str2}")
    println("str1===str3 : ${str1===str3}")






}