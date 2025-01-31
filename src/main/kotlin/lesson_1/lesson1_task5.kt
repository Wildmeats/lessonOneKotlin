package org.example.lesson_1

const val SECONDS_IN_MINUTE = 60
const val SECONDS_IN_HOUR = SECONDS_IN_MINUTE * 60

fun main() {
    val secondsInSpace = 5340

    val hours = secondsInSpace / SECONDS_IN_HOUR
    val minutes = (secondsInSpace % SECONDS_IN_HOUR) / SECONDS_IN_MINUTE
    val seconds = secondsInSpace % SECONDS_IN_MINUTE

    val formattedTime = "%02d:%02d:%02d".format(hours, minutes, seconds)
        println("$formattedTime – Гагарин провел в космосе.")

}
