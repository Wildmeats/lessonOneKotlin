package org.example.lesson_1

fun main() {

        val day = 5

        val isHandsAndAbs = day % 2 != 0
        val isLegsAndBack = day % 2 == 0

        println("Упражнения для рук:    $isHandsAndAbs \nУпражнения для ног:    ${!isHandsAndAbs}" +
                "\nУпражнения для спины:  ${!isHandsAndAbs} \nУпражнения для пресса: $isHandsAndAbs")
    }
