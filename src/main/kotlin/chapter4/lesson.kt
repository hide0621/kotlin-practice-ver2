package chapter4

fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.filter { it % 2 == 0 }
    println(result)
}