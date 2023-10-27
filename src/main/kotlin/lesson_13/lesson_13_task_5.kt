package lesson_13

fun main() {

    val contactList = mutableListOf<SubscriberData5>()

    do {

        println("Введите имя:")
        val userName = readln()
        if (userName.lowercase() == STOP2) break

        println("Введите номер телефона:")
        val userPhoneNumber = readln().toLong()
        if (userPhoneNumber == null) {
            println("Не указан номер телефона")
            continue
        }
        if (userPhoneNumber.toString().lowercase() == STOP2) break

        println("Введите название компании или пропустите этот шаг нажав Enter:")
        val userCompany = readln()
        if (userCompany.lowercase() == STOP2) break

        val userData = SubscriberData5(userName, userPhoneNumber.toString(), userCompany)
        contactList.add(userData)
    } while (true)

    contactList.forEach { println(it.printSubscriberData5()) }

}

class SubscriberData5(
    var name: String?,
    var phoneNumber: String,
    var company: String? = null,
) {
    fun printSubscriberData5() {
        println("$name\n$phoneNumber\n$company")
    }
}

const val STOP2 = "стоп"