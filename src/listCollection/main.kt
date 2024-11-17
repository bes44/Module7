package listCollection

/*
1. Дан список целых чисел. Вывести в консоль первый элемент списка двумя способами: обратившись по индексу, через стандартную функцию first().
2. Дан список целых чисел. Вывести в консоль среднее арифметическое элементов списка двумя способами: в ручную – через цикл, с применением стандартной функции average().
3. Дан список целых чисел. Вывести в консоль сумму элементов списка двумя способами: в ручную – через цикл, с применением стандартной функции sum().
4. Дан список целых чисел. Вывести в консоль количество элементов списка двумя способами: в ручную – через цикл, с применением стандартной функции count().
5. Дан список целых чисел. Вывести в консоль сумму двух последних элементов списка двумя способами: в ручную – через цикл, с применением стандартной функции takeLast().
6. Дан список целых чисел. Вывести в консоль сумму индексов элементов списка двумя способами: в ручную – через цикл, с применением стандартной функции indices().
* */


fun main() {
    println("Задание1")
    val numbers = listOf(10, 20, 30, 40, 50)
    println("Первый элемент (по индексу): ${numbers[0]}")
    println("Первый элемент (через функцию first()): ${numbers.first()}")
    println("Последний элемент (через функцию last()): ${numbers.last()}")
    println("Задание2")
    var sum = 0
    for (number in numbers) {
        sum += number
    }
    val manualAverage = sum.toDouble() / numbers.size
    println("Среднее арифметическое (вручную): $manualAverage")
    val standardAverage = numbers.average()
    println("Среднее арифметическое (через функцию average()): $standardAverage")
    println("Задание3")
    sum = 0
    for (number in numbers) {
        sum += number
    }
    println("Сумма (вручную): $sum")
    println("Сумма (через функцию sum()): ${numbers.sum()}")
    println("Задание4")
    sum = 0
    for (number in numbers) {
        sum += 1
    }
    println("Количество элементов (вручную): $sum")
    println("Количество элементов (через функцию count()): ${numbers.count()}")
    println("Задание5")
    sum = 0
    for (i in numbers.size - 2 until numbers.size) {
        sum += numbers[i]
    }
    println ("Сумма двух последних элементов (вручную): $sum")
     println("Сумма двух последних элементов (takeLast()): ${numbers.takeLast(2).sum() }")
    println("Задание6")
    sum = 0
    for (i in numbers.indices) { sum += i }
    println("Сумма индексов элементов (вручную): $sum")
    println("Сумма индексов элементов (indices): ${numbers.indices.sum()}")
}
