package lesson_15

fun main() {

    val electricGuitars = Instrument("электрогитара", 15)

    val gigBag = Accessories("чехол", 10)
    val guitarStrings = Accessories("cтруны", 200)
    val stand = Accessories("стойка", 20)
    val cable = Accessories("кабель", 70)
    val plectrums = Accessories("медиатор", 500)

    electricGuitars.addAccessories(gigBag)
    electricGuitars.addAccessories(guitarStrings)
    electricGuitars.addAccessories(stand)
    electricGuitars.addAccessories(cable)
    electricGuitars.addAccessories(plectrums)
    println()

    electricGuitars.searchAccessories(electricGuitars)

}

abstract class InstrumentAndAccessories {
    abstract val name: String
    abstract val number: Int
}

interface Search {
    fun searchAccessories(search: Instrument) {
        println("Выполняется поиск")
        val inputData = readln().lowercase()
        search.accessories.filter { it.name == inputData }.forEach {
            println("Комплектующее ${it.name} в кол-ве ${it.number}")
        }
    }
}

class Instrument(
    override val name: String,
    override val number: Int,
    val accessories: MutableList<Accessories> = mutableListOf()
) : InstrumentAndAccessories(), Search {

    fun addAccessories(_accessories: Accessories) {
        accessories.add(_accessories)
        println(
            """
            Добавлено комплектующее ${_accessories.name} 
            к инструменту $name в кол-ве ${_accessories.number}.
            """.trimIndent()
        )

    }

}

class Accessories(
    override val name: String,
    override val number: Int
) : InstrumentAndAccessories()

