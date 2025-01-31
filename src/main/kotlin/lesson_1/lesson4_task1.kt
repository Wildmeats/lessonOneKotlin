package org.example.lesson_1

const val MAX_TABLES = 13

fun main() {

    val tables = 13
    val tables2 = 9

    val freeSeatsToday: Boolean = tables < MAX_TABLES
    val freeSeatsTomorrow: Boolean = tables2 < MAX_TABLES

    println("[Доступность столиков на сегодня: $freeSeatsToday]")
    println("[Доступность столиков на завтра: $freeSeatsTomorrow]")
}