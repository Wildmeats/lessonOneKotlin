package org.example.lesson_1

const val MIN_NUM_OF_CREW = 55
const val MAX_NUM_OF_CREW = 70
const val PROVISIONS = 50

fun main() {

    println("- наличие повреждений корпуса(true / false):")
    var userInput1: Boolean = readLine()?.toBoolean() ?: false

    println("- текущий состав экипажа:(Введите число)")
    var userInput2: Int = readLine()?.toInt() ?: 0

    println("- количество ящиков с провизией на борту:(Введите число)")
    var userInput3: Int = readLine()?.toInt() ?: 0

    println("- благоприятность метеоусловий:(true / false)")
    var userInput4: Boolean = readLine()?.toBoolean() ?: false

    val missionCheck = (!userInput1 && userInput2 in MIN_NUM_OF_CREW..MAX_NUM_OF_CREW && userInput3 > PROVISIONS)
            || (userInput1 && userInput2 == MAX_NUM_OF_CREW && userInput3 >= PROVISIONS && userInput4)

    println(missionCheck)
}