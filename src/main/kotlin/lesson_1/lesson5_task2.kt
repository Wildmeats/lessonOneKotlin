package org.example.lesson_1
const val AGE = 18
fun main() {


    var currentYear = 2025

    println("Введите год своего рождения:")

    val yearOfBirth = readln().toInt()

    val currentAge = currentYear - yearOfBirth

    if(currentAge >= AGE) {
        println("\"“Показать экран со скрытым контентом\"")
    }




}