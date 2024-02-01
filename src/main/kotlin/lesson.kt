fun main() {

    var array = arrayOf(1, 2, 3, 4, 5)

//    println(array[0])

    /*
    下５つの処理は全て同じ結果になる
    downToは降順になる
    untilは最後の値を含まない
    */


    for (i in array) {
        println(i)
    }

    for (i in 0..4) {
        println(array[i])
    }

    for (i in 0 until 5) {
        println(array[i])
    }

    for (i in 4 downTo 0) {
        println(array[i])
    }

    // forEach内はラムダ式
    array.forEach { println(it) }

}