package chapter3

fun main() {

    // 配列のパターン
    // リストもこれと同じ

    var array = arrayOf(1, 2, 3, 4, 5)
    for (i in array) {
        println(i)
    }

    // インデックスも表示
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")
    }

    // インデックスだけindexに渡す
    for (index in array.indices) {
        println("the element at $index is ${array[index]}")
    }

    // セットのパターン
    var set = setOf(1, 2, 3, 4, 5)
    for (i in set) {
        println(i)
    }

    // マップのパターン
    var map = mapOf(1 to "one", 2 to "two", 3 to "three")
    for (kv in map) {
        println(kv) // 1=one, 2=two, 3=three
    }


    // キーと値を同時に
    for ((key, value) in map) {
        println("the element at $key is $value")
    }

    // mapのキーだけkeyに渡す
    for (key in map.keys) {
        println("the element at $key is ${map[key]}")
    }

    // mapの値だけ
    for (value in map.values) {
        println("the element is $value")
    }

}

