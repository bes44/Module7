package extensionsFun

/*
1. Написать функцию расширения возведения в квадрат целого числа.
2. Написать функцию расширения конкатенации строк.
3. Написать функцию расширения определения последнего индекса в строке.
4. Написать функцию получения квадратного корня из целого числа.
* */

import kotlin.math.sqrt
fun Int.square(): Int {
    return this * this
}

fun String.concatenate(other: String): String {
    return this + other
}

fun String.lastIndex(): Int {
    return this.length - 1
}

fun Int.squareRoot(): Double {
    return sqrt(this.toDouble())
}


fun main() {
    var number = 4
    println("Квадрат числа $number: ${number.square()}")
    val str1 = "Hello, "
    val str2 = "world!"
    println("Конкатенация строк: ${str1.concatenate(str2)}")
    val str = "Kotlin"
    println("Последний индекс строки \"$str\": ${str.lastIndex()}")
    number = 16
    println("Квадратный корень числа $number: ${number.squareRoot()}")
}
