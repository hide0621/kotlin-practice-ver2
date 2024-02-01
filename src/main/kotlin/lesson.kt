fun main() {

    // kolinはデフォルトでnullを許容しない
//    var str:String = null

    // nullを許容する場合は?（セーフコール演算子）をつける
    var str2:String? = null

    //メソッドの実行時にもセーフコール演算子は使える

    var name = "hoge"
    println(name.length) // 4

    var str3:String? = null
    println(str3?.length) // null

    // nullを返すとまずい場合はエルビス演算子を使う
    var email:String? = null
    println(email?.length ?: "") // 空文字
    println(email?.length ?: "メールアドレスが登録されていません") // メールアドレスが登録されていません
    println(email?.length ?: 0) // 0

    // !!（ヌル安全演算子）を使うとnullを許容しないと宣言できる
    var num: Int? = 10

    // null許容型と算術演算子は一緒に使えない
//    println(num * 10)

    // 一緒に使うには「スマートキャスト」と!!（ヌル安全演算子）を使う２パターンがある

    // スマートキャスト
    // if文の中でnullでないことが確定している場合に使える(numの型がnull許容型であっても、Int?型をInt型にキャストしてくれる)
    if (num != null) {
        println(num * 10)
    }

    // !!（ヌル安全演算子）
    // nullでないことを明示的に宣言する
    println(num!! * 10)

    var num1: Int? = 10

    var num2: Int = num1!!
    println(num2 * 10)

    // ただし、!!（ヌル安全演算子）はnullの場合に例外を投げるので、nullの可能性がある場合は使わない方が良い
    var num3: Int? = null
//    var num4: Int = num3!! // kotlin.KotlinNullPointerException

}