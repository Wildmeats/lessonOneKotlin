package org.example.lesson_1

fun main(){
    val numberOfOrders: Int = 75
    val orderPaid: String = "Благодарим вас за покупку наших товаров!"
    var numberOfЕmployees: Int = 2000
    println("У вас оплачено $numberOfOrders заказов\n$orderPaid")
    //println("Количество работников интернет магазина $numberOfЕmployees")
    numberOfЕmployees -=1
    println("Количество работников интернет-магазина $numberOfЕmployees")
}