import java.util.ArrayList

fun main() {
    val obj = T()
    obj.draw(Shape())
    obj.draw(Shape())
    obj.draw(Shape())
    obj.draw(Shape())
    val array :Array<Shape> = Array(3) {Shape()}
    array [0] = Square()
    array [1] = Rectangle()
    array [2] = Circle()
    for (i in 0 until array.size)
    {
        array [i].printVar()
    }
}
open class Shape
{
    open fun printVar()
    {
        println("Shape")
    }
}
class Circle : Shape()
{
    override fun printVar() {
        println("Circle")
    }
}
class Rectangle : Shape()
{
    override fun printVar() {
        println("Rectangle")
    }
}
class Square : Shape()
{
    override fun printVar() {
        println("Square")
    }
}
class T
{
    fun draw(a : Shape)
    {
        a.printVar()
    }
}