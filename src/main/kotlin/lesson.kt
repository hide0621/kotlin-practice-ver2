fun main() {

    var any:Any = "Hello"
    println("$any is ${any::class}")
    println("$any is ${any::class.simpleName}")

    any = 1
    println("$any is ${any::class}")
    println("$any is ${any::class.simpleName}")

}