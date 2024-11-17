package filterFun

/**
 * 1. Дан map, в которой элементы содержат ключ целое число, значения имена.
 * Отфильтруйте ее по значению ключа, допустим, менее значения равного 5.
 *
 * 2. Дан map, в которой элементы содержат ключ целое число, значения имена.
 * Отфильтруйте по значениям, оканчивающимся на букву «а».
 *
 * 3. Дан map, в которой элементы содержат ключ целое число, значения имена.
 * Отфильтруйте по значениям, Начинающимся на букву «Г».
 *
 * 4. Дан map prizeMap, описывающий ключом порядковый номер сотрудника, значение характеризует процент премии сотруднику.
 * Отфильтровать исходный map с таким расчетом, чтобы получить данные сотрудников, чей порядковый номер оканчивается на «5» и процент премии больше 20.
*/

private fun Int.endsWith( key:Int): Boolean {
//    println("${this} ${ this % 10 }")
    return (this % 10 == key)
}

fun main() {
    val people = mapOf(1 to "Иван", 2 to "Петр", 3 to "Лида", 4 to "Геннадий", 5 to "Анна", 6 to "Никодим")

    var filteredPeople = people.filter { (key, _) -> key < 5 }
    println("Отфильтрованная коллекция: $filteredPeople")

    filteredPeople = people.filter { (_, value) -> value.endsWith('а') }
    println("Отфильтрованная коллекция: $filteredPeople")

    filteredPeople = people.filter { (_, value) -> value.startsWith('Г') }
    println("Отфильтрованная коллекция: $filteredPeople")

    val prizeMap = mapOf(
        1 to 10,
        5 to 25,
        10 to 30,
        15 to 22,
        25 to 15,
        35 to 50
    )

    val filteredPrizeMap = prizeMap.filter { (key, value) -> (key.endsWith(5) && value > 20) }

    println("Отфильтрованные данные сотрудников: $filteredPrizeMap")





}
