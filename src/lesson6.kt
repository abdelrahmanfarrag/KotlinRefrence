fun main(args : Array<String>){
    val number = 5
    when(number){
        1 -> println("Number value is 1")
        2 -> println("Number value is 2")
        5 -> print("Number value is 5")
        else ->{
            println("No value assigned")
        }
    }
}
/*Lesson notes
* When is instead of switch in java
* it follows the same syntax as switch except instead of default , it uses else for default value
* also replace case with ->*/