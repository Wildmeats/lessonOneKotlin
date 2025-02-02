package org.example.lesson_1

fun main() {

    val winNum: Byte = 5
    val winNum2: Byte = 23

    println(
        """
    |Тебе нужно угадать два числа от 0 до 42.
    |Если угадаешь оба числа то выиграешь главный приз!" 
    |А если угадаешь только одно число то получишь утешительный приз.
    """.trimMargin()
    )

    println("Введите первое число - от 0 до 42.")

    val num1: Byte = readln().toByte()

    println("Введите второе число - от 0 до 42.")

    val num2: Byte = readln().toByte()

    if ((winNum == num1 || winNum2 == num1) && (winNum == num2 || winNum2 == num2) && (num1 != num2)) {
        println("\"Поздравляем! Вы выиграли главный приз!\"")

    } else if ((num1 == winNum) || (num1 == winNum2) || (num2 == winNum) || (num2 == winNum2)) {
        println("\"Вы выиграли утешительный приз!\"")
    } else {
        println("\"Неудача!\"")
    }
    println("\"Для победы надо было ввести $winNum и $winNum2\"")

}