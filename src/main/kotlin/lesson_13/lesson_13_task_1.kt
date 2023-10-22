package lesson_13

fun main() {
    val user1 = SubscriberData("Sidorov", 78885551234, null)
    user1.printSubscriberData()
}

class SubscriberData(
    val name: String,
    val phoneNumber: Long,
    val company: String?,
) {
    fun printSubscriberData() {
        println("$name\n$phoneNumber\n$company")
    }
}