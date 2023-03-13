fun main() {
    val x = Operation()
    x.sum(3 , 3)
    x.sub(3 , 3)
    x.mul(3 , 3)
    x.div(3 , 3)
    
}
open class Sum
{
    open fun sum (a:Int , b:Int)
    {
        println("$a + $b = ${a+b}")
    }
}
open class Sub : Sum()
{
    fun sub (a:Int , b:Int)
    {
        println("$a + $b = ${a-b}")
    }
}
open class Div : Sub()
{
    fun div (a:Int , b:Int)
    {
        println("$a + $b = ${a/b}")
    }
}
open class Mul : Div()
{
    fun mul (a:Int , b:Int)
    {
        println("$a + $b = ${a*b}")
    }
}
class Operation : Mul()
{
    override fun sum (a:Int , b:Int)
    {
        println("Sum of $a + $b = ${a+b}")
    }
}