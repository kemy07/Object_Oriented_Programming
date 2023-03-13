fun main() {
//    A1.x = 10
//    A1.y = 20
//    A1.sum()
    A1.x = 10
    A1.y = 20
    A1.sum()
}

class A1
{
    companion object {
        var x : Int? = null
        var y : Int? = null
        fun sum ()
        {
            println("$x + $y = " +(x!!+y!!))
        }
    }

}
//object A1
//{
//    var x : Int? = null
//    var y : Int? = null
//    fun sum ()
//    {
//        println("$x + $y = " +(x!!+y!!))
//    }
//}