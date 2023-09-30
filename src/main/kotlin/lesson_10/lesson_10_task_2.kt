package lesson_10


fun main() {

    println("Введите логин и пароль:")
    val userRegistration = findLength(readln(), readln())

    val check = if (userRegistration >= 2) {
        "Добро пожаловать!"
    } else {
        "Логин или пароль недостаточно длинные."
    }
    println(check)

}

fun findLength(login: String, password: String): Double {

    val passwordLenght = password.length
    val loginLenght = login.length
    return (passwordLenght + loginLenght) / 4.0

}