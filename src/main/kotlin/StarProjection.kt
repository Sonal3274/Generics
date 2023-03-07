// Define a function that takes a list of any type
fun printList(list: List<*>) {
    for (item in list) {
        println(item)
    }
}fun main() {
// Call the function with a list of strings
    val stringList = listOf("foo", "bar", "baz")
    println("Printing string list:")
    printList(stringList)

// Call the function with a list of integers
    val intList = listOf(1, 2, 3)
    println("Printing integer list:")
    printList(intList)

}