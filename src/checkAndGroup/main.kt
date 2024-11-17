package checkAndGroup

/*
1. Дан список слов в произвольном порядке по алфавиту. Необходимо сгруппировать элементы по первому символу.
2. Дан список строк. Необходимо сгруппировать его по длине строки.
3. Дан список телефонов по году выпуска phoneToYear. Не забывайте он может выглядеть как map(ключ - значение), но на самом деле внутри себя будет содержать объект Pair. Необходимо с группировать объекты по годам выпуска телефонов. Исходный список, например, такой.
val phoneToYear = listOf(
"Nexus One" to 2010,
"Pixel 2" to 2017,
"Pixel 4a" to 2020,
"iPhone 4" to 2010,
"iPhone X" to 2017,
"Galaxy Note 8" to 2017,
"Galaxy S11" to 2020
)
* */


fun groupByFirstChar(words: List<String>): Map<Char, List<String>> {
    return words.groupBy { it.first() }
}

fun groupByLength(strings: List<String>): Map<Int, List<String>> {
    return strings.groupBy { it.length }
}

fun groupPhonesByYear(phoneToYear: List<Pair<String, Int>>): Map<Int, List<String>> {
    return phoneToYear.groupBy({ it.second }, { it.first })
}


fun main() {
    val words = listOf("apple", "banana", "apricot", "blueberry", "cherry", "avocado")
    val groupedWords = groupByFirstChar(words)
    println("Сгруппированные слова по первому символу: $groupedWords")

    val  strings = listOf("Дан список слов в произвольном порядке по алфавиту.",
        "Необходимо сгруппировать элементы по перв. символу.",
        "Дан список строк.",
        "Необходимо сгруппировать его по длине строки.",
        "Дан список телефонов по году выпуска phoneToYear")

    val groupedStrings = groupByLength(strings)
    println("Сгруппированные строки по длине: $groupedStrings")
    val phoneToYear = listOf(
        "Nexus One" to 2010,
        "Pixel 2" to 2017,
        "Pixel 4a" to 2020,
        "iPhone 4" to 2010,
        "iPhone X" to 2017,
        "Galaxy Note 8" to 2017,
        "Galaxy S11" to 2020
    )
    val groupedPhones = groupPhonesByYear(phoneToYear)
    println("Сгруппированные телефоны по году выпуска: $groupedPhones")


}
