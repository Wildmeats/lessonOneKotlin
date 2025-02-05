package org.example.lesson_1

const val KILOMETERS = 100

fun main() {

    println("Введите растояние поездки (в километрах)")

    val travelDistance: Double = readln().toDouble()

    println("Введите расход топлива на 100 км (в литрах)")

    val fuelConsumption: Double = readln().toDouble()

    println("Введите текущую цену на бензин")

    val fuelPrice: Double = readln().toDouble()

    val fuel = (travelDistance * fuelConsumption) / KILOMETERS
    val price = fuel * fuelPrice

    println("Для поездки понадобится - ${"%.2f".format(fuel)} топлива \nСтоимость поездки составит: ${"%.2f".format(price)}")

}

