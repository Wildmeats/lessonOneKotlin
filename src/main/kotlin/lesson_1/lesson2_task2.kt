package org.example.lesson_1

fun main() {

    val salary: Int = 30_000
    val salaryNew: Int = 20_000
    var workers: Short = 50
    var trainees: Short = 30

    val cashExpensesWorkers: Int = salary * workers

    val totalCashExpenses: Int = salary * workers + salaryNew * trainees

    val averageEmployeeSalary: Int = totalCashExpenses/ workers + trainees

    println("Расходы на выплату зарплаты постоянных сотрудников: $cashExpensesWorkers " +
        "\nОбщие расходы по ЗП после прихода стажеров: $totalCashExpenses" +
        "\nСредняя зарплата одного сотрудника после устройства стажеров: $averageEmployeeSalary")
}