package chapter3

fun main() {

    // 論理演算子
    // 否定表現はGo言語のそれと同じ
    var z = 10
    println(!(z > 5))
    println(!true)
    println(!false)

    var ok = true
    if (ok) {
        println("OK")
    } else {
        println("NG")
    }

    if (!ok) {
        println("NG")
    } else {
        println("OK")
    }

    // 範囲演算子
    // 1..5 は 1, 2, 3, 4, 5 という範囲を表す
    for (i in 1..5) {
        println(i)
    }

    // 1 until 5 は 1, 2, 3, 4 という範囲を表す
    for (i in 1 until 5) {
        println(i)
    }

    // 5 downTo 1 は 5, 4, 3, 2, 1 という範囲を表す
    for (i in 5 downTo 1) {
        println(i)
    }

    // 1..5 step 2 は 1, 3, 5 という範囲を表す
    for (i in 1..5 step 2) {
        println(i)
    }

    // 5 downTo 1 step 2 は 5, 3, 1 という範囲を表す
    for (i in 5 downTo 1 step 2) {
        println(i)
    }

    // in演算子：対象が範囲内にあるかどうかを判定する
    var x = 3
    if (x in 1..5) {
        println("OK")
    } else {
        println("NG")
    }

    var n1 = 10
    var n2 = 20
    var array = arrayOf(n1, n2)
    println(15 in n1..n2) // 10 <= 15 <= 20 なのでtrue
    println(15 !in n1..n2) // 10 <= 15 <= 20 なのでfalse
    println(15 in array) // 10, 20 なのでfalse
    println(15 !in array) // 10, 20 なのでtrue
    println("B" in "A".."C") // "A" <= "B" <= "C" なのでtrue

}

