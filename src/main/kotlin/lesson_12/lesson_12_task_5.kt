package lesson_12

import kotlin.random.Random

fun main() {

    val dailyWeatherInformation = mutableListOf<DailyWeather5>()

    for (i in ZERO..NUMBER_OF_OBJECTS) {
        val newDailyTemperature =
            Math.round(Random.nextDouble(MIN_TEMPERATURE, MAX_TEMPERATURE) - VALUE_DIFFERENCE_2).toInt()
        val newNightTemperature =
            Math.round(Random.nextDouble(MIN_TEMPERATURE, MAX_TEMPERATURE) - VALUE_DIFFERENCE_2).toInt()
        val newHasPrecipitationDuringTheDay = Random.nextBoolean()
        val weather =
            DailyWeather5(newDailyTemperature, newNightTemperature, newHasPrecipitationDuringTheDay)
        dailyWeatherInformation.add(weather)
    }

    dailyWeatherInformation.forEach {
        println(
            "${it.dailyTemperature}" +
                    " ${it.nightTemperature} ${it.hasPrecipitationDuringTheDay}"
        )
    }

    println()
    println()
    val daytimeTemperatureList = dailyWeatherInformation.map { it.dailyTemperature }
    daytimeTemperatureList.forEach { println(it) }
    println()
    val nightTemperatureList = dailyWeatherInformation.map { it.nightTemperature }
    nightTemperatureList.forEach { println(it) }
    println()
    val hasPrecipitationDuringTheDayList = dailyWeatherInformation.map { it.hasPrecipitationDuringTheDay }
    hasPrecipitationDuringTheDayList.forEach { println(it) }
    println()
    val averageDaytimeTemperature = Math.round(daytimeTemperatureList.average())
    println(averageDaytimeTemperature)
    val averageNightTemperature = Math.round(nightTemperatureList.average())
    println(averageNightTemperature)
    val numberOfDaysWithPrecipitation = hasPrecipitationDuringTheDayList.count { it }
    println(numberOfDaysWithPrecipitation)
}

class DailyWeather5(_dailyTemperature: Int, _nightTemperature: Int, _hasPrecipitationDuringTheDay: Boolean) {

    var dailyTemperature = _dailyTemperature
    var nightTemperature = _nightTemperature
    var hasPrecipitationDuringTheDay = _hasPrecipitationDuringTheDay
}


private const val VALUE_DIFFERENCE_2 = 273.15
private const val MIN_TEMPERATURE = 243.15
private const val MAX_TEMPERATURE = 318.15
private const val ZERO = 0
private const val NUMBER_OF_OBJECTS = 30
