fun main() {

    var num = 10
    var num2: Int = 20
    var num3 = 30L

    println(num::class)
    println(num2::class)
    println("$num3: ${num3::class}")

    // アンサインド（符号なし）とすることでマイナスの範囲を除外し、byteの範囲を0~255とする
    var num4: UByte = 255U
    println("$num4: ${num4::class}")

    var str: String = "Hello"
    var ch: Char = 'A'

    println("$str: ${str::class}")
    println("$ch: ${ch::class}")

}