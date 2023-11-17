package lesson_22

fun main() {

    val galacticGuide = GalacticGuide(
        "Alpha Centauri",
        "отметить в баре День полотенца" +
                " заказав \"Пан галактический бластер для полоскания горла\"",
        "25.05.2020",
        4.22
    )

    println(galacticGuide.component1())
    println(galacticGuide.component2())
    println(galacticGuide.component3())
    println(galacticGuide.component4())
    println()
    println(galacticGuide.toString())
}

data class GalacticGuide(
    val nameOfThePlaceOrEvent: String,
    val descriptionOfThePlaceOrEvent: String,
    val dateAndTimeOfTheEvent: String,
    val distanceOfAPlaceOrEventFromEarth: Double,
) {
    override fun toString(): String {
        return """
            название места или события: ${component1()}
            описание места или события: ${component2()}
            дата и время события: ${component3()}
            расстояние места или события от Земли в световых годах: ${component4()}
        """.trimIndent()
    }
}