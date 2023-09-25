package lesson_7

fun main() {

    val passwordData = ('a'..'z') + ('A'..'Z') + ('0'..'9')
    val passwordLength = readln().toInt()
    var password: String = ""

    for (i in 1..passwordLength) {
        password += passwordData.random()
    }

    println(password)

}