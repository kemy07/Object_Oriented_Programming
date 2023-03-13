package Classes

class Class_Part1_zClass {
        var name: String? = null
        var gender: String? = null
        var length : Int? = null

        fun new_length()
        {
            this.length = this.length?.plus(10)
            println("My Length Is  ${this.length} cm ")
        }
        fun name ()
        {
            println("My name is " + this.name)
        }
        fun gender()
        {
            println("I am " + this.gender)
        }
    }