open class Shape {
    fun draw() {
        println("Shape is drawing")
    }
}

class Circle : Shape() {
    fun roll() {
        println("Circle is rolling")
    }
}

interface Drawer<in T> {
    fun draw(shape: T)
}

class ShapeDrawer : Drawer<Shape> {
    override fun draw(shape: Shape) {
        shape.draw()
    }
}

fun main() {
    val circleDrawer: Drawer<Circle> = ShapeDrawer()
    circleDrawer.draw(Circle())
}
