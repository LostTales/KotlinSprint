package lesson_4

fun main() {

    val isSunnyWeather: Boolean = true
    val isOpenTent: Boolean = true
    val airHumidity: Int = 20
    val season: String = "зима"

    val isFavorableConditions =
        isSunnyWeather == IS_SUNNY_WEATHER && isOpenTent == IS_OPEN_TENT
                && airHumidity == REQUIRED_AIR_HUMIDITY && season != BAD_SEASON
    println("Благоприятные ли условия сейчас для роста бобовых?$isFavorableConditions")

}

const val REQUIRED_AIR_HUMIDITY = 20
const val BAD_SEASON: String = "зима"
const val IS_SUNNY_WEATHER = true
const val IS_OPEN_TENT = true
