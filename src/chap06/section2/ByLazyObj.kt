package chap06.section2

class Person1(val name: String, val age: Int)

fun main() {
    var isPersonInstantiated: Boolean = false

    val person : Person1 by lazy {
        isPersonInstantiated = true
        Person1("Kim", 23)
    }
    val personDelegate = lazy { Person1("Hong", 40) }

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")

    println("person.name = ${person.name}")  // 이 시점에서 초기화
    println("personDelegate.value.name = ${personDelegate.value.name}")  // 이 시점에서 초기화

    println("person Init: $isPersonInstantiated")
    println("personDelegate Init: ${personDelegate.isInitialized()}")
}