package infuxFun

data class Point(val x: Int, val y: Int)

infix fun Point.isAbove(other: Point): Boolean {
    return this.y > other.y
}

infix fun Point.isRightOf(other: Point): Boolean {
    return this.x > other.x
}

infix fun Point.isLeftOf(other: Point): Boolean {
    return this.x < other.x
}

infix fun Point.isBelow(other: Point): Boolean {
    return this.y < other.y
}