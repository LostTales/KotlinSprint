package lesson_11

fun main() {

    val screen = Screen()

    val user1 = User3(
        userpic = "user1Image.jpg",
        nickname = "Vadim",
        microphoneOff = true,
    )

    val user2 = User3(
        userpic = "user2Image.jpg",
        nickname = "Olga",
        userTalk = true,
    )

//    user1.enterBio3()
//    user1.changePassword3()
//    user1.printUser3()
//    println("Написать сообщение:")
//    val message = user1.writeMessage3()
//    println(message)

    val room1 = Room(
        cover = "image.jpg",
        title = "pets",
        memberList = mutableListOf(user1),
//        user = user1
    )

    screen.createScreen()
    room1.addMember(user2)
    room1.printUserList()
    println()
    user1.showStatus()
    user1.showNickname(true)
    user2.showStatus()
    user2.showNickname(false)
    println()
    room1.removeMember(user1)
    room1.printUserList()
    println()
    room1.printRoom()
    screen.stopScreen()
}

class Screen() {
    fun createScreen() = println("Экран создан")
    fun stopScreen() = println("Экран закрыт")
}

class Room(
    val cover: String,
    val title: String,
    var memberList: MutableList<User3>,
) {
    fun addMember(userAdd: User3) {
        memberList.add(userAdd)
        println("Пользователь ${userAdd.nickname} добавлен.")
    }

    fun removeMember(userRemove: User3) {
        memberList.remove(userRemove)
        println("Пользователь ${userRemove.nickname} удален.")
    }

    fun printUserList() {
        print("Всего участников ${memberList.size}, а именно: ")
        println("${memberList.joinToString() { it.nickname }}.")
    }

    fun printRoom() {
        println(
            "$cover\n$title\n${
                memberList.forEach {
                    println(
                        "${it.userpic}\n${it.nickname}\n"
                    )
                }
            }"
        )
    }

}

class User3(
    val userpic: String,
    val nickname: String,
    var userTalk: Boolean = false,
    var microphoneOff: Boolean = false,
) {

    fun showStatus(): String {
        val myStatus = if (userTalk) "$nickname разговаривает"
        else if (microphoneOff) "$nickname микрофон выключен"
        else "пользователь $nickname заглушен"
        println(myStatus)
        return myStatus
    }

    fun showNickname(longPress: Boolean): String {
        val myNickname = if (longPress) nickname else "nickname скрыт"
        println(myNickname)
        return myNickname
    }

//    fun enterBio3() {
//        println("Введите информацию о себе:")
//        userIsMuted = readln()
//    }
//
//    fun changePassword3() {
//        do {
//            println("Введите пароль:")
//            val actualPassword = readln()
//            if (actualPassword != userTalk) println("Неверный пароль.")
//        } while (actualPassword != userTalk)
//        println("Введите новый пароль:")
//        val newPassword = readln()
//        userTalk = newPassword
//        println("Ваш пароль изменен. Новый пароль:\n$userTalk")
//    }

    fun writeMessage3(inputMessage: String = readln()): String {
        println("$nickname вам пришло сообщение:")
        return inputMessage
    }

}