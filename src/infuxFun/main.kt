package infuxFun
/*
* 1. Написать четыре инфиксных функции: сложения, вычитания, умножения и деления.
*  В функции main применить их для разных операндов, результат вывести в консоль.
2. Написать класс Person. В конструктор он принимает свойство имени.
* Внутри класса есть инфиксная функция say, которая будет передавать сообщение объекта этого класса,
*  переданное в параметр. Сообщение внутри функции выводится с помощью println.
3. Создать data класс Point(точка), характеризующее место объекта. Написать две инфиксные функции,
*  расширяющие этот класс. Они характеризуют расположение одной точки относительно другой – isAbove() – описывает ситуацию,
*  когда одна точка выше другой, isRightOf – описывает ситуацию, когда одна точка правее другой.
* В функции main создать два объекта Point и сравнить их расположение, применив вышеуказанные функции.
* */

infix fun Int.add(other: Int): Int = this + other

infix fun Int.subtract(other: Int): Int = this - other

infix fun Int.multiply(other: Int): Int = this * other

infix fun Int.divide(other: Int): Int = this / other


fun main() {
    val a = 10
    val b = 2

    val additionResult = a add b
    val subtractionResult = a subtract b
    val multiplicationResult = a multiply b
    val divisionResult = a divide b

    println("Результат сложения: $additionResult")
    println("Результат вычитания: $subtractionResult")
    println("Результат умножения: $multiplicationResult")
    println("Результат деления: $divisionResult")

    val person = Person("Иван")
    person say "Привет всем!"


    val point1 = Point(3, 5)
    val point2 = Point(2, 4)

    println("Точка $point1 выше точки $point2: ${point1 isAbove point2}")
    println("Точка $point1 правее точки $point2: ${point1 isRightOf point2}")
    println("Точка $point1 ниже точки $point2: ${point1 isBelow point2}")
    println("Точка $point1 левее точки $point2: ${point1 isLeftOf point2}")

}
