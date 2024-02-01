fun main() {

    // コレクション型...可変長
    // 例：リスト、セット、マップ
    // セット...順番の概念がなく（インデックス番号がなく）、重複した要素を持たない

    var set = mutableSetOf(10, 20, 30)
    println(set)

    // 要素の追加
    set.add(40)
    println(set)

    // 要素の削除
    set.remove(30)
    println(set)



}