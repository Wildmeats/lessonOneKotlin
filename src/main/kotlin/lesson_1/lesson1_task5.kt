package org.example.lesson_1

fun main() {
    val secondsInSpace = 5340
    val hours = secondsInSpace / 3600
    val minutes = (secondsInSpace % 3600) / 60
    val seconds = secondsInSpace % 60
    val formattedTime = "%02d:%02d:%02d".format(hours, minutes,seconds)
    println("$formattedTime Гагарин провел в космосе.")

}