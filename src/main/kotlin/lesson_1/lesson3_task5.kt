package org.example.lesson_1

fun main() {
    val dataLine = "D2-D4;0"

    val parts = dataLine.split(";")
    val moveInfo = parts[0]
    val moveFlag = parts[1]

    val positions = moveInfo.split("-")
    val startPosition = positions[0]
    val endPosition = positions[1]

    val startColumn = startPosition[0]
    val startRow = startPosition[1]
    val endColumn = endPosition[0]
    val endRow = endPosition[1]

    println("Откуда: $startColumn$startRow")
    println("Куда: $endColumn$endRow")
    println("Номер хода: $moveFlag")
}