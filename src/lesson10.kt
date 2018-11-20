fun main (args:Array<String>){
    Dog(name = "DOG",age = 10,type = "MIMAL")

}
open class Animal(name: String, age: Int, type: String) {
    init {
        println("$name $age $type")
    }

}
class Dog(name: String, age: Int, type: String) : Animal(name = name, age = age, type = type) {
    init {
        println("Animal name is $name")
        println("Animal Age is $age")
        println("Animal Type is $type")
    }
    
}
