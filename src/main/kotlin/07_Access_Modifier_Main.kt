fun main() {
    val x = Q()
    x.setName("Kamel")
    val z = x.getName()
    println("The name is $z")
}
open class Q {
    var name1:String? = null
    private var name2:String? = null
    protected var name3:String? = null
    fun setName(p_name2:String)
    {
        this.name2 = p_name2
    }
    fun getName() :String?
    {
        return this.name2
    }
}
class R : Q ()
{
    fun names()
    {
        super.name1
        super.name3
    }
}