package chap03.section3

fun main() {
noParam { "Hello world" }
}

fun noParam(out:()->String)=println(out())