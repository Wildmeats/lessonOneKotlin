package org.example.lesson_1

import kotlin.random.Random

fun main() {

    val winNum = List(3) { Random.nextInt(0, 42).toByte() }

   println(
        """
   |Тебе нужно угадать три числа от 0 до 42.
   |Если угадаешь все числа то выиграешь джекпот!" 
   |А если угадаешь только два числа то получишь крупный приз.
   |И если угадал только одно число получаешь утешительный приз
    """.trimMargin()
    )

    val userNum = mutableListOf<Byte>()

    println("Введите первое число от 0 до 42.")
    val num1 = readln().toByte()
    userNum.add(num1)

    println("Введите второе число от 0 до 42.")
    val num2 = readln().toByte()
    userNum.add(num2)

    println("Введите третье число от 0 до 42.")
    val num3 = readln().toByte()

    userNum.add(num3)

    val convergences = userNum.count { it in winNum }

    if (convergences == 3) {
        println("Вы угадали все числа! ДЖЕКПОТ!!!")
    } else if (convergences == 2) {
        println("Вы угадали 2 числа и получаете крупный приз!")
    } else if (convergences == 1) {
        println("Вы угадали одно число и получаете утешительный приз.")
    } else {
        println("Вы не угадали ни одного из чисел...")
    }
    println("Выигрышные числа $winNum")
}