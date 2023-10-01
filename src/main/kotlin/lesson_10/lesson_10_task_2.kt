package lesson_10


fun main() {

    println("Введите логин и пароль:")

    val check = if (findLength(readln(), readln())) {
        "Добро пожаловать!"
    } else {
        "Логин или пароль недостаточно длинные."
    }
    println(check)

}

fun findLength(login: String, password: String): Boolean {

    val passwordLenght = password.length
    val loginLenght = login.length
    return passwordLenght >= STRING_LENGHTH && loginLenght >= STRING_LENGHTH

}

const val STRING_LENGHTH = 4
