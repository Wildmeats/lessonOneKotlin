package org.example.lesson_1

fun main() {

    val num1 = 2
    val num2 = 3

    println("Что бы убедиться что вы не бот решите математический пример, ($num1 + $num2 = введите результат):")

    val userResult = readln().toInt()

    if (userResult == num1 + num2) {
        println("\"Добро пожаловать!\"")
    } else {
        println("\"Доступ запрещен\"")
    }

}