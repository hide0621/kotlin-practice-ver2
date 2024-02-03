package chapter3

fun main() {

    // break
    for (i in 1..10) {
        if (i == 5) {
            break
        }
        println(i) // 1, 2, 3, 4
    }

    // continue
    for (i in 1..10) {
        if (i == 5) {
            continue
        }
        println(i) // 1, 2, 3, 4, 6, 7, 8, 9, 10
    }

    // break 2重for文
    for (i in 1..10) {
        for (j in 1..10) {
            if (j == 5) {
                break // ここでbreakすると内側のfor文のみが終了する(外側のfor文は継続)
            }
            print(j) // 1234のループが10回
        }
        println()
    }

    // continue 2重for文
    for (i in 1..10) {
        for (j in 1..10) {
            if (j == 5) {
                continue // ここでcontinueすると内側のfor文のみが終了する(外側のfor文は継続)
            }
            print(j) // 1234678910のループが10回
        }
        println()
    }

    // ラベルを付与して外側のfor文を終了する
    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (j == 5) {
                break@outer // ここでbreakすると外側のfor文が終了する
            }
            print(j) // 1234が1回
        }
        println()
    }

    // jのループ内でj == 5の条件が満たされた場合、continue@outerが実行され、外側のループが次のイテレーションに進む
    // これにより、j == 5のときのprint(j)はスキップされる
    // 外側のfor文が終了する訳でないので注意
    outer@ for (i in 1..10) {
        for (j in 1..10) {
            if (j == 5) {
                continue@outer // ここでcontinueすると外側のfor文が次のイテレーションに進む
            }
            print(j) // 1234が10回
        }
        println()
    }

}

