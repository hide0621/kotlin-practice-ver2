fun main() {

    // コレクション型...可変長
    // 例：リスト、セット、マップ
    // マップ...キーと値のペア, キーは重複不可

    var map = mutableMapOf("a" to 1, "b" to 2, "c" to 3)
    println(map)

    // 要素の追加
    map["d"] = 4
    println(map)

    // 要素の削除
    map.remove("a")
    println(map)


}