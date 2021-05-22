package chapsection1

import kotlin.math.PI
import kotlin.math.abs
import com.example.edu.Person as User


fun main() {
    val intro:String="안녕하세요!"
    val num:Int=20
    val user1=User("Kildong", 30)
    val user2=Person("A123", "Kildong")


    println(PI)
    println(abs(-12.6))
    println("intro : $intro, num : $num")
    println(user1.name)
    println(user1.age)
    println(user2.id)
    println(user2.name)
}



class Person(val id:String, val name: String)