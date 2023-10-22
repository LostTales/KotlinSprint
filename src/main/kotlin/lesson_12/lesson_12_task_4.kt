package lesson_12

fun main() {

    val weatherToday = DailyWeather4(300, 292, true)
}

class DailyWeather4(_dailyTemperature: Int, _nightTemperature: Int, _hasPrecipitationDuringTheDay: Boolean) {

    var dailyTemperature = _dailyTemperature - VALUE_DIFFERENCE
    var nightTemperature = _nightTemperature - VALUE_DIFFERENCE
    var hasPrecipitationDuringTheDay = _hasPrecipitationDuringTheDay

    init {
        println(
            String.format(
                """
            Информация о погоде:
            - дневная температура ${Math.round(dailyTemperature)} °C
            - ночная температура ${Math.round(nightTemperature)} °C
            - наличие осадков в течение суток: $hasPrecipitationDuringTheDay
        """.trimIndent()
            )
        )
    }

}

const val VALUE_DIFFERENCE = 273.15