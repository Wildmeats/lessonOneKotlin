package org.example.lesson_1

fun main() {
    val schoolboys = 4
    val rating = 3 + 4 + 3 + 5
    val averageRating = rating.toDouble() / schoolboys
    println("Средний балл в классе - %.2f".format(averageRating))
}