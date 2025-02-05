package org.example.lesson_1

const val BASIC_AIR_HUMIDITY = 20
const val BASIC_TIME_OF_YEAR = "Зима"
fun main() {

    var currentSunnyWeather: Boolean = true
    var currentOpenAwning: Boolean = true
    var currentAirHumidity: Int = 20
    var currentTimeOfYear: String = "Зима"

    val checkingCondition: Boolean = currentSunnyWeather &&
            currentOpenAwning &&
            currentAirHumidity == BASIC_AIR_HUMIDITY &&
            currentTimeOfYear != BASIC_TIME_OF_YEAR


    println("Благоприятные ли условия сейчас для роста бобовых? $checkingCondition")
}