package org.example.lesson_1

fun main() {

    var startColumn = "E"
    var startRow = 2
    var endColumn = "E"
    var endRow = 4
    var moveNumber = 1

    val firstMove = "[$startColumn$startRow:$endColumn$endRow;$moveNumber]"

    println(firstMove)

    startColumn = "D"
    startRow = 2
    endColumn = "D"
    endRow = 3
    moveNumber = 2

    val secondMove = "[$startColumn$startRow:$endColumn$endRow;$moveNumber]"

    println("Следующий ход белых: \n$secondMove")
}
