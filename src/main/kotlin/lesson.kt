fun main() {

    var name:String? = null

    if (name != null) {
        println(name.length)
    } else {
        println("name is null")
        println(name?.length ?: "名前がnullになってます。")
    }

}