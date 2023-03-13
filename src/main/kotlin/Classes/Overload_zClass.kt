package Classes

class Overload_zClass {
    fun sum (a:Int , b:Int)
    {
        println("Sum of ${a + b} =  " + (a + b))
    }
    fun sum (a:Double , b:Int)
    {
        println("Sum of $a + $b =  " + (a + b))
    }

}