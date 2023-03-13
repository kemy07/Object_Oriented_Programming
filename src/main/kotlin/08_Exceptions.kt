import java.lang.ArithmeticException
import java.lang.NumberFormatException

fun main() {
    tr@while(true)
    {
        try {
            println("Enter Two Number: ")
            val x:Int = readLine()!!.toInt()
            val y:Int = readLine()!!.toInt()
            println("$x / $y = ${x / y}")
            break@tr
        }
        catch (e:NumberFormatException)
        {
            println(e)
            println("Please Enter Integer number")
            println("Try Again")
            continue@tr
        }
        catch (e:ArithmeticException)
        {
            println(e)
            println("Please do not divide number by Zero")
            println("Try Again")
            continue@tr
        }
    }
}