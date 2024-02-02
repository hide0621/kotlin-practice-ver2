package chapter3

fun main() {

    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
    }

    // 見づらいので修正
    for (i in 1..10) {
        for (j in 1..10) {
            print("${i * j} ")
        }
        println()
    }

    // format関数を使って見やすくする
    for (i in 1..10) {
        for (j in 1..10) {
            print("%2d ".format(i * j))
        }
        println()
    }


}

