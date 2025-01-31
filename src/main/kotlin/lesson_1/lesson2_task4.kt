package org.example.lesson_1

const val PERCENT_DIVISOR = 100

fun main() {

    val crystallineOre: Byte = 7
    val ironStone: Byte = 11
    val buff: Byte = 20

    val increaseByBuff: Int = crystallineOre * buff / PERCENT_DIVISOR

    val increaseByBuffIron: Int = ironStone * buff / PERCENT_DIVISOR

    println("Количество бонусных кристалов - $increaseByBuff \nКоличество бонусного железа - $increaseByBuffIron ")

}

