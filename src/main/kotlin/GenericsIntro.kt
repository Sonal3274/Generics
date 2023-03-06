/*
* Generics allows you to create a general class which is not type dependent.
*
*/

fun main() {
    val intContainer = Container(3)
    intContainer.getValue()
    val stringContainer = Container("Hello")
    stringContainer.getValue()
}

class Container<T>(var data: T){
    fun setValue(value : T){
        data = value
    }
    fun getValue(): T{
        println(data)
        return data
    }
}