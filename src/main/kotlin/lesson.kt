fun main() {

    // コレクション型...可変長
    // 例：リスト、セット、マップ
    // リスト...Go言語で言うスライスみたいなもの

    var list = listOf(10, 20, 30)
    println(list[0])
    println(list)

    // listOf() is immutable
//    list[0] = 100

    // mutableListOf() is mutable
    list = mutableListOf(10, 20, 30)
    list[0] = 100
    println(list)

    // 追加
    list.add(40)
    println(list)

    list.add(0,500)
    println(list)

    // 削除
    list.removeAt(0)
    println(list)

    list.remove(100)
    println(list)

}