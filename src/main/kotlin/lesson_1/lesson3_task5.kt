package org.example.lesson_1

fun main() {
    val dataLine = "D2-D4;0"

    val parts = dataLine.split("-", ";")

    println(parts)

    val startPosition = parts[0]
    val endPosition = parts[1]
    val moveFlag = parts[2]

    println("Откуда: $startPosition")
    println("Куда: $endPosition")
    println("Номер хода: $moveFlag")
}