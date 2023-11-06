package lesson_15

fun main() {

    val user1 = OrdinaryUser("Alex")
    val admin = Administrator("Jack")
    admin.addUser(user1)
    user1.readForum()
    user1.writeMessage()
    admin.readForum()
    try {
        admin.removeMessage(user1)
    } catch (exception: Exception) {
        println("Exception:\n${exception.message}")
    }
    admin.writeMessage()
    admin.removeUser(user1)

}

abstract class User(open val name: String = "") {

    abstract fun readForum()
    abstract fun writeMessage()

}

class OrdinaryUser(
    override val name: String,
    val message: MutableList<String> = mutableListOf(),
) : User(name) {

    override fun readForum() {
        println("Пользователь $name читает форум.")
    }

    override fun writeMessage() {
        println("Сообщение от пользователя $name:")
        val writeMessage = readln()
        message.add(writeMessage)
        println("Пользователь $name написал сообщение: $writeMessage.")
    }

}

class Administrator(
    override val name: String,
    val usersList: MutableList<OrdinaryUser> = mutableListOf(),
) : User(name) {

    override fun readForum() {
        println("Администратор $name читает форум.")
    }

    override fun writeMessage() {
        println("Администратор $name написал сообщение.")
    }

    fun addUser(user: OrdinaryUser) {
        usersList.add(user)
        println("Добавлен новый пользователь ${user.name}.")
    }

    fun removeUser(user: OrdinaryUser) {
        usersList.remove(user)
        println("Удален пользователь ${user.name}.")
    }

    fun removeMessage(user: OrdinaryUser) {
        println("Удалить сообщение №:")
        user.message.removeAt(readln().toInt())
        println("Удалено сообщение пользователя ${user.name}.")
    }

}