fun main() {
    val a = Operation1()
    a.sum(2 , 2 )
    a.sub(2 , 2)
}
interface Sum1
{
    fun sum(a:Int , b:Int)

}
interface Sub1
{
    fun sub(a:Int , b:Int)

}
class Operation1 : Sum1 ,Sub1 {
    override fun sum(a: Int, b: Int) {
        println("$a + $b = ${a + b}")
    }

    override fun sub(a: Int, b: Int) {
        println("$a + $b = ${a - b}")
    }
}
