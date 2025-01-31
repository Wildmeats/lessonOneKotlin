package org.example.lesson_1

const val HOUR_IN_MINUTE = 60


fun main() {

    val trainDepartureHour: Byte = 9
    val trainDepartureMinute: Byte = 39
    val travelTime: Short = 457

    val departureTimeInMinutes = trainDepartureHour * HOUR_IN_MINUTE + trainDepartureMinute

    val arrivalTimeInMinutes = departureTimeInMinutes + travelTime

    val arrivalHour = arrivalTimeInMinutes / HOUR_IN_MINUTE
    val arrivalMinute = arrivalTimeInMinutes % HOUR_IN_MINUTE

    val formattedTime = "%02d:%02d".format(arrivalHour, arrivalMinute)

    println("Время прибытия: $formattedTime")
}

