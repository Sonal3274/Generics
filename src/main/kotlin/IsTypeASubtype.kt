open class Animal {
}

class Cat : Animal()

class Dog : Animal()

fun main() {
    val cat: Animal = Cat()

    if (cat is Cat) {
        println("cat is a Cat")
    }

    if (cat is Animal) {
        println("cat is an Animal")
    }

    if (cat !is Dog) {
        println("cat is not a Dog")
    }
}
