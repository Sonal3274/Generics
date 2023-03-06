fun exampleFunction(value: Any) {
    if (value is String) {
        // value is now smart cast to String
        println(value.toUpperCase())
    } else if (value is Int) {
        // value is now smart cast to Int
        println(value + 1)
    } else {
        // value is not a String or Int
        println("Unknown type")
    }
}

fun main() {
    exampleFunction("Hello, World!") // prints "HELLO, WORLD!"
    exampleFunction(42) // prints "43"
    exampleFunction(true) // prints "Unknown type"
}
