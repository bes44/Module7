package mapCollection

/*
* 1. *** Напишите функцию, которая получает на вход массив элементов типа К (Generic) и возвращает Map<K, Int>,
*  где K — значение из массива, а Int — количество вхождений в массив. Т.е. массив val array = arrayOf(2, 4, 7, 1, 2, 4).
*  Выходные данные: {1=1, 2=2, 4=2, 7=1}.
2. Дан map val people = mutableMapOf(1 to "Иван", 2 to "Петр",3 to "Лида", 4 to "Петр", 5 to "Анна").
*  Написать функцию, удаляющую элементы по введенному с клавиатуры значению.
* Т.е., если набрали «Петр» коллекция должна стать такого вида {1=Иван, 3=Лида, 5=Анна}
3. Создать data класс Person, в конструктор он принимает свойства имени, возраста и должности.
*  В главной функции создать personHashMap и заполнить его несколькими элементами,
* где ключом будет целое число – порядковый номер, значением – объект Person. Вывести полученную коллекцию в консоль.
* */


fun <K> countOccurrences(array: Array<K>): Map<K, Int> {
    return array.groupingBy { it }.eachCount()
}


fun removeByName(people: MutableMap<Int, String>, name: String) {
    val iterator = people.iterator()
    while (iterator.hasNext()) {
        val entry = iterator.next()
        if (entry.value == name) {
            iterator.remove()
        }
    }
}

fun main() {
    val array = arrayOf(2, 4, 7, 1, 2, 4)
    val occurrences = countOccurrences(array.sortedArray())
    println("Количество вхождений в массив: $occurrences")

    val people = mutableMapOf(1 to "Иван", 2 to "Петр", 3 to "Лида", 4 to "Петр", 5 to "Анна")
    println("Введите имя для удаления:")
    val nameToRemove = readLine()
    nameToRemove?.let {
        removeByName(people, it)
    }
    println("Обновленная коллекция: $people")

    val personHashMap = hashMapOf(
        1 to Person("Иван", 30, "Менеджер"),
        2 to Person("Петр", 25, "Разработчик"),
        3 to Person("Лида", 28, "Тестировщик"),
        4 to Person("Анна", 22, "Аналитик")
    )
    personHashMap.forEach { (key, value) -> println("Ключ: $key, Значение: $value") }
}
