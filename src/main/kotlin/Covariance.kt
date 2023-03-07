open class Animal1 {
    fun speak() {
        println("Animal is speaking")
    }
}

class Cat1 : Animal1() {
    fun meow() {
        println("Cat is meowing")
    }
}

fun main() {
    val cats: List<Cat1> = listOf(Cat1(), Cat1())

    printAnimals(cats)
}


fun printAnimals(animals: List<Cat1>) {
    for (animal in animals) {
        animal.speak()
    }
}
