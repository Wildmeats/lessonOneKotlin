package org.example.lesson_1

const val INITIAL_WEIGHT = 35
const val MAX_WEIGHT = 100
const val MAX_LITERS = 100

fun main() {

    val cargo1Weight = 20
    val cargo2Weight = 50
    val cargo2Liters = 20
    val cargo3Liters = 100

    println("Груз с весом 20 кг соответствует категории 'Average': " +
            "${cargo1Weight >= INITIAL_WEIGHT && cargo1Weight <= MAX_WEIGHT}" )

    println("Груз с весом 50 кг и 20 литров соответствует категории 'Average':" +
    "${cargo2Weight >= INITIAL_WEIGHT && cargo2Weight <= MAX_WEIGHT && cargo2Liters <= MAX_LITERS}")

    println("Груз с весом 100 литров соответствует категории 'Average':" +
    "${cargo3Liters <= MAX_LITERS}")


}