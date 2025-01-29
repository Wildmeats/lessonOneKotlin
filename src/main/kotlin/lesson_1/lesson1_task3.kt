package org.example.lesson_1

fun main() {
    val yearOfFlight: Int = 1961
    var hour: Int = 9
    var minute: Int = 7
    val formattedTime = "%02d:%02d".format(hour, minute)
    println("Год полета - $yearOfFlight \nВзлет - $formattedTime")
    hour = 10
    minute = 55
    println("Посадка - $formattedTime")
}