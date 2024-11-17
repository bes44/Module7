package setCollection

/*
1. Разбить созданный набор на две коллекции, чтобы в одной содержались четные элементы, в другой – нечетные.
2. Дан набор целых чисел. Необходимо создать новое множество в который будут помещены элементы прежнего умноженные на два,
 но с условием, что попадают в набор только элемент кратные пяти после умножения.
3. Создать функцию removeDuplicates (collection: Collection<T>?), которая будет возвращать набор неповторяющихся элементов.
 Обратите внимание, что в параметры функции передан элемент Collection параметризованного типа.
4. Дан массив целых чисел. Нужно переместить все нули в конец массива, сохранив порядок остальных элементов.
Т.е. исходный массив 0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0 Результат: 6, 2, 1, 5, 0, 0, 0, 0, 0, 0, 0, 0
 */
fun splitEvenOdd(numbers: Set<Int>): Pair<List<Int>, List<Int>> {
    val evenNumbers = numbers.filter { it % 2 == 0 }
    val oddNumbers = numbers.filter { it % 2 != 0 }
    return Pair(evenNumbers, oddNumbers)
}

fun createSetWithCondition(numbers: Set<Int>): Set<Int> {
    return numbers.map { it * 2 }.filter { it % 5 == 0 }.toSet()
}

fun <T> removeDuplicates(collection: Collection<T>?): Set<T> {
    return collection?.toSet() ?: emptySet()
}

fun moveZerosToEnd(array: IntArray): IntArray {
    val nonZeroElements = array.filter { it != 0 }
    val zeroElements = array.filter { it == 0 }
    return (nonZeroElements + zeroElements).toIntArray()
}

fun main() {
    println("Задание1")
    val numbers = setOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val (evenNumbers, oddNumbers) = splitEvenOdd(numbers)
    println("Четные элементы: $evenNumbers")
    println("Нечетные элементы: $oddNumbers")

    println("Задание2")
    val resultSet = createSetWithCondition(numbers)
    println("Результирующее множество: $resultSet")

    println("Задание3")
    val numbersDouble = listOf(1, 2, 2, 3, 3, 3, 4, 4, 4, 4)
    val uniqueNumbers = removeDuplicates(numbersDouble)
    println("Уникальные элементы: $uniqueNumbers")

    println("Задание4")
    val array = intArrayOf(0, 6, 0, 0, 2, 0, 0, 0, 1, 0, 5, 0)
    val resultArray = moveZerosToEnd(array)
    println("Результат: ${resultArray.joinToString(", ")}")

}
