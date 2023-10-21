package lesson_12

fun main() {

    val weatherToday = DailyWeather3(300, 292, true)
    weatherToday.printDailyWeather3()
}

class DailyWeather3(_dailyTemperature: Int, _nightTemperature: Int, _hasPrecipitationDuringTheDay: Boolean) {

    var dailyTemperature = _dailyTemperature - VALUE_DIFFERENCE
    var nightTemperature = _nightTemperature - VALUE_DIFFERENCE
    var hasPrecipitationDuringTheDay = _hasPrecipitationDuringTheDay

    fun printDailyWeather3() {

        println(
            String.format(
                """
            Информация о погоде:
            - дневная температура %.2f °C
            - ночная температура %.2f °C
            - наличие осадков в течение суток: $hasPrecipitationDuringTheDay
        """.trimIndent(), dailyTemperature, nightTemperature
            )
        )

    }
}

const val VALUE_DIFFERENCE = 273.15