package chap08.section2


data class Product1(val name: String, val price: Double)

fun main(args : Array<String>) {
    val products = arrayOf(
        Product1("Snow Ball", 870.00),
        Product1("Smart Phone A", 999.00),
        Product1("Drone", 240.00),
        Product1("Mouse", 633.55),
        Product1("Keyboard", 125.99),
        Product1("Smart Phone B", 1500.99),
        Product1("Mouse", 512.99))

    // 두 객체의 비교, p1이 크면 1, 같으면 0, 작으면 -1
    products.sortWith(
        Comparator<Product1> { p1, p2 ->
            when {
                p1.price > p2.price -> 1
                p1.price == p2.price -> 0
                else -> -1
            }
        }
    )
    products.forEach { println(it) }
    println()

    //  compareBy를 함께 사용해 두개의 정보 정렬
    // varargs로 받고 있으므로 두개 이상 사용 가능
    products.sortWith(compareBy({it.name}, {it.price}))
    products.forEach { println(it) }
    println()

    // 지정된 필드의 가장 작은/큰 값 골라내기
  //  println(products.minBy { it.price })
 //   println(products.maxBy { it.price })

}