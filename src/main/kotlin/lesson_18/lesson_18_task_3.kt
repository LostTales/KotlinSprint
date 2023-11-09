package lesson_18

fun main() {

    val fox: Animal = Fox("Лиса", "ягоды")
    val dog: Animal = Dog("Собака", "кости")
    val cat: Animal = Cat("Кошка", "рыба")

    val animal = listOf<Animal>(fox, dog, cat)

    animal.forEach { println(it.play()) }
    animal.forEach { println(it.sleep()) }
    animal.forEach { println(it.eat()) }
}

open class Animal {
    open fun play() = "играет"
    open fun sleep() = "спит"
    open fun eat() = "ест"
}

class Fox(
    private val name: String,
    private val food: String,
) : Animal() {
    override fun play(): String {
        return "[$name]-[${super.play()}]"
    }

    override fun sleep(): String {
        return "[$name]-[${super.sleep()}]"
    }

    override fun eat(): String {
        return "[$name]-[${super.eat()} $food]"
    }
}

class Dog(
    private val name: String,
    private val food: String,
) : Animal() {
    override fun play(): String {
        return "[$name]-[${super.play()}]"
    }

    override fun sleep(): String {
        return "[$name]-[${super.sleep()}]"
    }

    override fun eat(): String {
        return "[$name]-[${super.eat()} $food]"
    }
}

class Cat(
    private val name: String,
    private val food: String,
) : Animal() {
    override fun play(): String {
        return "[$name]-[${super.play()}]"
    }

    override fun sleep(): String {
        return "[$name]-[${super.sleep()}]"
    }

    override fun eat(): String {
        return "[$name]-[${super.eat()} $food]"
    }
}