inline fun <reified T> createList(vararg items: T): List<T> {
    return items.toList()
}

fun main() {
    val stringList = createList("foo", "bar", "baz")
    val intList = createList(1, 2, 3, 4, 5)
    val booleanList = createList(true, false)

    println(stringList) // prints [foo, bar, baz]
    println(intList) // prints [1, 2, 3, 4, 5]
    println(booleanList) // prints [true, false]
}
