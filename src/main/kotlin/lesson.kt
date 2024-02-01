fun main() {

    var x: Int = 10

    println("$x = ${x::class.simpleName}")

    var y: Float = x.toFloat()

    println("$y = ${y::class.simpleName}")

    var z: String = x.toString()

    println("$z = ${z::class.simpleName}")

    var dd = 1.6

    println("$dd = ${dd::class.simpleName}")

    var d: Int = dd.toInt()

    println("$d = ${d::class.simpleName}") // 1

}