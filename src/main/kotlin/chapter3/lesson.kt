package chapter3

fun main() {

    var num = 120

    // if文の書き方
    if (num > 100) {
        println("Greater than 100")
    } else if (num > 50) {
        println("Greater than 50")
    } else {
        println("Less than 50")
    }

    // if文の書き方（変数に代入する）
    var str = if (num > 100) {
        "Greater than 100"
    } else if (num > 50) {
        "Greater than 50"
    } else {
        "Less than 50"
    }
    println(str)

    // when文の書き方（Go言語のswitch、case文に似ている）
    when (num) {
        100 -> println("Hundred")
        50 -> println("Fifty")
        5, 6, 7 -> println("Five or Six or Seven")
        in 11..20 -> println("Between 11 and 20")
//        else -> println("Neither")
        else -> {
            println("Neither")
            println("該当する数字がない")
        }
    }

    when {
        num > 100 -> println("Greater than 100")
        num > 50 -> println("Greater than 50")
        else -> println("Less than 50")
    }

    // when文の書き方（変数に代入する）
    var str2 = when {
        num > 100 -> "Greater than 100"
        num > 50 -> "Greater than 50"
        else -> "Less than 50"
    }
    println(str2)

    // when文の書き方（型チェック）
    var num2: Any = "10"

    when (num2) {
        is Int -> println("Int")
        is Double -> println("Double")
        is String -> println("String")
        else -> println("該当する型がない")
    }

}

