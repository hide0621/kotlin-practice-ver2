fun main() {

    var array = intArrayOf(1, 2, 3, 4, 5)

    var array1 = arrayOf(1, 2, 3, 4, 10)

    // 両者の型（IntArrayとArray<Int>）は別物なのでエラーになる
//    array = array1

    // 初期値がnullの配列を作成（要素数は5）
    var array2 = arrayOfNulls<String>(5)

    for (i in array2) {
        println(i)
    }

    // 上記の初期値を具体的な値に上書き（型はArray<String?>のまま）
    array2 = arrayOf("a", "b", "c", "d", "e")

    for (i in array2) {
        println(i)
    }

}