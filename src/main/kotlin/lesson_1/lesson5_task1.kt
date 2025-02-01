package org.example.lesson_1

fun main() {

    val a = 2
    val b = 3

    println("Что бы убедиться что вы не бот решите математический пример, ($a + $b = введите результат):")

    val res = readln().toInt()

    if (res == 5) {
        println("\"Добро пожаловать!\"")
    } else {
        println("\"Доступ запрещен\"")
    }


}