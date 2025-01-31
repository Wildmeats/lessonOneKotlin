package org.example.lesson_1
import kotlin.math.pow

fun main() {

    val clientMoney = 70_000.0
    val interestRate = 16.7
    val timesPerYear = 1
    val years = 20

    val totalAmount = clientMoney * (1 + interestRate / (100 * timesPerYear)).pow(timesPerYear * years)

    println("Размер вклада через $years лет составит: %.3f".format(totalAmount))
}