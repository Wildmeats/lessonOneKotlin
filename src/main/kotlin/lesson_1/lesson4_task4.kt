package org.example.lesson_1

fun main() {

    val day = 5

    val isHandsAndAbs = day % 2 != 0


    println(
        """
                |Упражнения для рук:    $isHandsAndAbs 
                |Упражнения для ног:    ${!isHandsAndAbs}
                |Упражнения для спины:  ${!isHandsAndAbs} 
                |Упражнения для пресса: $isHandsAndAbs
    """.trimMargin()
    )
}
