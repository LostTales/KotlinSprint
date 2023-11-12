package lesson_20

fun main() {

    { username: String -> println("С наступающим Новым Годом, $username!") }("name1")

    val congratulations: (String) -> String = { username: String -> "С наступающим Новым Годом, $username!" }
    println(congratulations("name2"))
}