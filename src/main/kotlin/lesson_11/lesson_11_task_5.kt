package lesson_11

fun main() {

    val forum = Forum()
    forum.printThread()
}

class Forum(
    val memberForumList: MutableList<ForumMember> = mutableListOf(
        ForumMember("randomId1", "Dina"),
        ForumMember("randomId2", "Irina")
    ),
    val forumMessages: MutableList<ForumMessage> = mutableListOf(
        ForumMessage("randomId1", "text1"),
        ForumMessage("randomId2", "text2")
    ),
) {

    fun createNewUser(newUserName: String): ForumMember {

        val idData = ('a'..'z') + ('A'..'Z') + ('0'..'9')
        val idLength = 5
        var randomId: String = ""

        for (i in 1..idLength) {
            randomId += idData.random()
        }

        val newUser = ForumMember(randomId, newUserName)
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
    val userId: String,
    val userName: String,
)

class ForumMessage(
    val authorId: String,
    val message: String,
)