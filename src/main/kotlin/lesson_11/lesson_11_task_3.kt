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

    val room1 = Room(
        cover = "imageWH.jpg",
        title = "WH:40K",
        memberList = mutableListOf(user1),
    )

    val room2 = Room(
        cover = "imageSW.jpg",
        title = "StarWars",
        memberList = mutableListOf(user2),
    )

    screen.createScreen()

    println()
    room1.printRoom()
    println()
    room1.addMember(user2)
    println()
    room1.printRoom()
    println()
    room1.printUserList()
    println()
    user1.showStatus()
    println()
    user1.userTalk = true
    user1.showStatus()
    println()
    user1.showNickname(true)
    println()
    user2.showStatus()
    println()
    user2.showNickname(false)
    println()
    room1.removeMember(user1)
    println()
    room1.printUserList()
    println()
    room1.printRoom()
    println()

    println()
    room2.printRoom()
    println()
    room2.addMember(user1)
    println()
    room2.printRoom()
    println()
    room2.printUserList()
    println()
    user1.showStatus()
    println()
    user1.userTalk = false
    user1.showStatus()
    println()
    user1.showNickname(false)
    println()
    user2.showStatus()
    println()
    user2.showNickname(true)
    println()
    room2.removeMember(user2)
    println()
    room2.printUserList()
    println()
    room2.printRoom()
    println()

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
        println("Пользователь ${userRemove.nickname} вышел.")
    }

    fun printUserList() {
        print("Всего участников ${memberList.size}, а именно: ")
        println("${memberList.joinToString() { it.nickname }}.")
    }

    fun printRoom() {
        println("$cover\n$title")
        memberList.forEach { println(it.userpic) }
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

}