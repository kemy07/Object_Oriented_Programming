import Classes.Anonymous_Class

fun main() {
    val s = Ploy()
    s.ploy(object : AA
    {
        override fun draw() {
            println("Hi From Anomous Class")
        }
    })
}
class Ploy
{
    fun ploy(e:AA)
    {
        e.draw()
    }
}
interface AA {
     fun draw()
}