fun <T> exampleFunction(value: T) {
    if (value is String) {
        // value is now smart cast to String
        println(value.toUpperCase())
    } else {
        // value is still of type T
        println("Unknown type")
    }
}

fun main() {
    exampleFunction("Hello, World!") // prints "HELLO, WORLD!"
    exampleFunction(42) // prints "Unknown type"
}
