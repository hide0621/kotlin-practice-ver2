package chapter3

fun main() {

    // while : 前判定
    var i = 0
    while (i < 10) {
        println(i)
        i++
    }

    // do-while : 後判定
    var j = 0
    do {
        println(j)
        j++
    } while (j < 10)

    // 故にこうなる
    // こう言うことになるので、使わない方がいいかも...
    var k = 10
    do {
        println(k) // 10 が出力される
        k++
    } while (k < 10)

}

