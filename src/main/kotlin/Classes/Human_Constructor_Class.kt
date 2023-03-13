package Classes

class Human_Constructor_Class(p_age: Int) {
    var age:Int? = p_age

    init {
        println("Age = ${this.age}")
    }
    /*
    fun setAge()
    {
        this.age = 0
        println("Age = ${this.age}")
    }
    */
}