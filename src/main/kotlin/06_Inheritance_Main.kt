fun main() {
    val x = c()
    x.myAge()
    x.age
}
open class A
{
    var age :Int? = null
    fun myAge ()
    {
        this.age = 10
        println("Age = ${this.age}")
    }
}
open class B : A()
class c : B()