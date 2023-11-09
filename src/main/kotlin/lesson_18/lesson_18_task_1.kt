package lesson_18

fun main() {

    val newOrder1 = Order18()
    newOrder1.getOrder(1, "keyboard")
    newOrder1.getOrder(1, listOf("gamepad", "TV", "Xbox"))
}

class Order18 {

    fun getOrder(
        number: Int,
        product: List<String>
    ) {
        println("Заказаны следующие товары:[${product.joinToString("], [")}].")
    }

    fun getOrder(
        number: Int,
        product: String
    ) {
        println("Заказан товар:[$product]")
    }
}