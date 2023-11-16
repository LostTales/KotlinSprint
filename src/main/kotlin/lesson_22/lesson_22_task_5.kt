package lesson_22

fun main() {

    val galacticGuide = GalacticGuide(
        "Alpha Centauri",
        "отметить в баре День полотенца" +
                " заказав \"Пан галактический бластер для полоскания горла\"",
        "25.05.2020",
        4.22
    )

    println(galacticGuide)

    val (nameOfThePlaceOrEvent, descriptionOfThePlaceOrEvent,
        dateAndTimeOfTheEvent, distanceOfAPlaceOrEventFromEarth) = galacticGuide

    println()

    println(nameOfThePlaceOrEvent)
    println(descriptionOfThePlaceOrEvent)
    println(dateAndTimeOfTheEvent)
    println(distanceOfAPlaceOrEventFromEarth)
}

data class GalacticGuide(
    val nameOfThePlaceOrEvent: String,
    val descriptionOfThePlaceOrEvent: String,
    val dateAndTimeOfTheEvent: String,
    val distanceOfAPlaceOrEventFromEarth: Double,
) {
    override fun toString(): String {
        return """
            название места или события: $nameOfThePlaceOrEvent
            описание места или события: $descriptionOfThePlaceOrEvent
            дата и время события: $dateAndTimeOfTheEvent
            расстояние места или события от Земли в световых годах: $distanceOfAPlaceOrEventFromEarth
        """.trimIndent()
    }
}