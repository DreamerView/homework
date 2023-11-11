/**
 * You can edit, run, and share this code.
 * play.kotlinlang.org
 */
import java.util.Scanner
fun main() {
    
//     task1_1(2,4)
//     task1_2(3,4)
//     task2_1()
//     task2_2()
//     task3_1()
//     task3_2()
}
fun task1_1(a: Int, b: Int) {

    // Выполняем операции
    val sum = a + b
    val difference = a - b
    val product = a * b
    val quotient = a.toDouble() / b.toDouble() // Приводим к типу Double для точного деления

    // Выводим результаты
    println("1 задание")
    println("Сумма: $sum")
    println("Разность: $difference")
    println("Произведение: $product")
    println("Частное: $quotient")
}
fun task1_2(a: Int, b: Int) {
    println("2 задание")
    if(a>b) { 
        println("$a больше")
    }
    else {
        println("$b больше")
    }
}
fun task2_1() {
    print("Enter value: ")

    val stringInput = 2
    println("You entered: $stringInput")
}
fun task2_2() {
    val number = 1

    if (number % 2 == 0) {
        println("$number - четное число")
    } else {
        println("$number - нечетное число")
    }
}
fun task3_1() {
    val number = 5;
    
    for (i in 1..10) {
        val result = number * i
        println("$number * $i = $result")
    }
}
fun task3_2() {
    var userInput: Int

    while (true) {
        print("Введите число (для завершения введите 0): ")
        userInput = readLine()?.toIntOrNull() ?: 0

        if (userInput == 0) {
            println("Программа завершена.")
            break
        }

        val square = userInput * userInput
        println("Квадрат числа $userInput равен $square")
    }
}



