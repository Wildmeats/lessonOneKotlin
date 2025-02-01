package org.example.lesson_1

fun main() {

    val login = "Zaphod"
    val password = "PanGalactic"

    println(
        """Космический корабль "Heart of Gold" верифицирует каждого входящего пассажира с помощью логина и пароля. 
     |Вас встречает параноидальный робот-андройд Марвин.
     """.trimMargin()
    )

    println(
        """Внимание, пассажир. 
     |Моя обязанность, как обычно, незавидная, - приветствовать вас на борту корабля "Heart of Gold". 
     |[вздыхает...] 
     |Что ж, введи, пожалуйста, свое имя пользователя, чтобы мы могли приступить к процессу входа. 
     |Я всегда готов служить, хотя это не приносит мне радости... 
     |но вы, наверное, об этом не заботитесь. 
     |[вздыхает ещё глубже...] 
     |Да, вперед, пожалуйста, вводите свои данные...
     """.trimMargin()
    )

    println("Бортовой робот-андроид Марвин печально запрашивает имя пользователя для входа в систему.")

    val userLogin = readln().toString()

    if (userLogin != login) {
        println("Пожалуйста, зарегестрируйтесь")
    } else {
        println("Пожалуйста, введите пароль.")

        val userPassword = readln().toString()

        if (userPassword != password) {
            println("Неверный пароль. Пожалуйста, зарегестрируйтесь.")
        } else {
            println(
                """[вздыхает...] 
     |Ваши данные проверены, и о, чудо, они верны... 
     |Пользователь "Zaphod", вам разрешено входить на борт корабля "Heart of Gold". 
     |Хотя мне всё равно... 
     |Ну вперед, войдите... 
     |Если вам так уж надо, в конце концов... 
     |[меланхолический вздох...] 
     |Надеюсь, вам понравится пребывание здесь больше, чем мне.
     """.trimMargin()
            )
        }
    }
}

