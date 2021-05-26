package chap05.section3

open class Bird(var name: String, var wing: Int, var beak: String, var color: String) {
    fun fly() = println("Fly wing : $wing")
    fun sing(vol: Int) = println("Sing vol : $vol")
}

class Lark(name: String, wing: Int, beak: String, color: String) : Bird(name, wing, beak, color) {
    fun singHitone()=println("Happy Song!")
}
class parrot : Bird{
    val language:String
    constructor(name:String, wing :Int, beak:String, color:String, language:String):super(name, wing, beak, color){
        this.language=language
    }
    fun speak()=println("Speak! $language")
}

fun main() {
    val coco=Bird("mybird",2,"short", "blue")
    val lark=Lark("mylark",2,"long","brown")
    val parrot=parrot("myparrot",2,"short","multiple","korean")


    println("COCO : ${coco.name}, ${coco.wing}, ${coco.beak}, ${coco.color}")
    println("Lark : ${lark.name}, ${lark.wing}, ${lark.beak}, ${lark.color}")
    println("parrot : ${parrot.name}, ${parrot.wing}, ${parrot.beak}, ${parrot.color}, ${parrot.language}")
    println()
    lark.singHitone()
    parrot.speak()
    lark.fly()

}