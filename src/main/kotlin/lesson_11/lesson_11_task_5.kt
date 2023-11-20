package lesson_11

fun main() {

    val forum = Forum()
    forum.createNewUser("Dina")
    forum.createNewMessage("randomId")
    forum.createNewUser("Irina")
    forum.createNewMessage("randomId")
    forum.printThread()
}

class Forum(
    var memberForumList: MutableList<ForumMember> = mutableListOf(),
    val forumMessages: MutableList<ForumMessage> = mutableListOf(),
) {

    fun createNewUser(newUserName: String): ForumMember {

        val idData = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        val idLength = 5
        var randomId: String = ""

        for (i in 1..idLength) {
            randomId += idData.random()
        }
        val newId = randomId

        val newUser = ForumMember(newId, newUserName)
        memberForumList.add(newUser)

        return newUser
    }

    fun createNewMessage(inputUserId: String) {

        val idList = memberForumList.map { it.userId }

        if (inputUserId in idList) {
            println("Введите сообщение:")
            val newUserMessage = ForumMessage(inputUserId, readln())
            forumMessages.add(newUserMessage)
        } else {
            println("Такого участника форума нет.")
        }
    }

    fun printThread() {

        val userNameForumMember = memberForumList.map { it.userName }

        forumMessages.forEachIndexed { index, id ->
            if ((memberForumList.map { it.userId }).contains(id.authorId))
                println("${userNameForumMember[index]}:${id.message}")
        }
    }
}

class ForumMember(
    var userId: String,
    val userName: String,
) {

}

class ForumMessage(
    val authorId: String,
    val message: String,
)