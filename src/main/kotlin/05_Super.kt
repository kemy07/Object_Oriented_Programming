fun main() {
    val x = Z(20)
    // x.myAge2()

}
open class X   // indirect Super Class
{
    constructor() {
        println("hi From Constructor A")
    }

    var age :Int? = 10
    fun myAge ()
    {
        println("Age = ${this.age}")
    }
}
open class Y : X   // Y is direct super class to --> c
{
    constructor() {
        println("hi From Constructor B")
    }
    constructor(n:Int) {
        println("hi From Constructor B With Parameter $n")
    }
    var age2 :Int? = 20
    fun myAge2 ()
    {
        println("Age = ${super.age}")
        println("Age2 = ${this.age2}")

    }
}
class Z : Y   // Z is Sub Class
{
    constructor(n:Int) : super(n) {
        println("hi From Constructor C With $n")

    }
}