inline fun <reified T> printType() {
    println(T::class.simpleName)
}

fun main() {
    printType<String>() // prints "String"
    printType<Int>() // prints "Int"
    printType<Boolean>() // prints "Boolean"
}
/*
printType is an inline function with a reified type parameter as the Kotlin compiler will generate specialized code for
each call site of the function, based on the type argument passed to the function.
This can result in improved performance and reduced overhead compared to using a regular generic function with a
non-reified type parameter.
*/