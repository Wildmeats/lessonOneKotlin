package org.example.lesson_1

fun main() {

    var isSunnyWeather: Boolean = true
    var isOpenAwning: Boolean = true
    var isAirHumidity: Int = 20
    var isTimeOfYear: String = "Зима"

    val timeOfYear: Boolean = isTimeOfYear != "Зима"

    println("Благоприятные ли условия сейчас для роста бобовых?" +
            " ${isSunnyWeather && isOpenAwning && isAirHumidity == 20 && timeOfYear}")
}