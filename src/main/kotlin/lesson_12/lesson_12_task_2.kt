package lesson_12

fun main() {

    val weatherToday = DailyWeather2(29, 20, true)
    weatherToday.printDailyWeather2()
}

class DailyWeather2(_dailyTemperature: Int, _nightTemperature: Int, _hasPrecipitationDuringTheDay: Boolean) {

    var dailyTemperature = _dailyTemperature
    var nightTemperature = _nightTemperature
    var hasPrecipitationDuringTheDay = _hasPrecipitationDuringTheDay

    fun printDailyWeather2() {
        println(
            """
            Информация о погоде:
            - дневная температура $dailyTemperature °C"
            - ночная температура $nightTemperature °C"
            - наличие осадков в течение суток: $hasPrecipitationDuringTheDay
        """.trimIndent()
        )
    }
}