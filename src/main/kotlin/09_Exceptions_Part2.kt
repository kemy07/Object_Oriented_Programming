import java.lang.Exception

fun main() {
    printNum(-10)
}
fun printNum(a:Int)
{
    val ex = Exception()
    try
    {
        if (a < 0)
        {
            throw ex
        }
        println("Number = $a")

    }
    catch (e:Exception)
    {
        println(e)
    }
}