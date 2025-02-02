package org.example.lesson_1

fun main() {

    println("Введите свой вес")

    val userWeight: Double = readln().toDouble()

    println("Теперь введите свой рот в сантиметрах. (пример: 1.78")

    val userHeight: Double = readln().toDouble()

    val bmi: Double = userWeight/ (userHeight * userHeight)

    when {
        bmi < 18.5 -> println(":Недостаточная масса тела")
        18.5 <= bmi && bmi < 25 -> println(":Нормальная масса тела")
        25 <= bmi && bmi < 30 -> println(":Избыточная масса тела")
        bmi >= 30 -> println(":Ожирение")

    }
    val formattedBmi = String.format("%.2f", bmi)
    println("$formattedBmi ")

}