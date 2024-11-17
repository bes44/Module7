package scopeFun

class City(val name: String) {
    var population: Int = 0
    override  fun toString(): String {
        return "Город: $name, Население: $population"
    }
}