package lesson_13

fun main() {

    val contactList = mutableListOf<SubscriberData4>()

    do {

        println("Введите имя:")
        val userName = readln()
        if (userName.lowercase() == STOP) break

        println("Введите номер телефона:")
        val userPhoneNumber = readln().toLongOrNull()
        if (userPhoneNumber == null) {
            println("Не указан номер телефона")
            continue
        }
        if (userPhoneNumber.toString().lowercase() == STOP) break

        println("Введите название компании или пропустите этот шаг нажав Enter:")
        val userCompany = readln()
        if (userCompany.lowercase() == STOP) break

        val userData = SubscriberData4(userName, userPhoneNumber, userCompany)
        contactList.add(userData)
    } while (true)

    contactList.forEach { println(it.printSubscriberData4()) }

}

class SubscriberData4(
    var name: String?,
    var phoneNumber: Comparable<*>?,
    var company: String? = null,
) {
    fun printSubscriberData4() {
        println("$name\n$phoneNumber\n$company")
    }
}

const val STOP = "стоп"