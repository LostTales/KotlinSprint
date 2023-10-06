package lesson_11

fun main() {

    val user1: User2 = User2(
        id = 1,
        login = "Vadim",
        password = "NHL2023",
        email = "vadim@gmail.com",
    )

    user1.enterBio()
    user1.changePassword()
    user1.printUser2()
    println("Написать сообщение:")
    val message = user1.writeMessage()
    println(message)

}

class User2(
    val id: Int,
    val login: String,
    var password: String,
    val email: String,
    var bio: String = "no information"
) {

    fun printUser2() {
        println("$id\n$login\n$password\n$email\n$bio")
    }

    fun enterBio() {
        println("Введите информацию о себе:")
        bio = readln()
    }

    fun changePassword() {
        do {
            println("Введите пароль:")
            val actualPassword = readln()
            if (actualPassword != password) println("Неверный пароль.")
        } while (actualPassword != password)
        println("Введите новый пароль:")
        val newPassword = readln()
        password = newPassword
        println("Ваш пароль изменен. Новый пароль:\n$password")
    }

    fun writeMessage(inputMessage: String = readln()): String {
        println("$login вам пришло сообщение:")
        return inputMessage
    }

}