fun main(args: Array<String>) {

    var simpleClass = SimpleClass()
    simpleClass.printMyName(name = "Hello")

    var simpleConstructorClass = SimpleClassWithConstructor("World")
    simpleConstructorClass.printMyName()

}

class SimpleClass {
    fun printMyName(name: String) {
        println("My name is $name")
    }

}

class SimpleClassWithConstructor(var name: String) {
    fun printMyName() {
        println("My name is $name")
    }

}
/*Lesson notes
* to create a class, just like java use class keyword followed by name of class follow by {}
* to create a constructor of class , after name class add () and put in it the variables you want
* to make an object of the class , make variable followed by = and u do not need to write new keyword
* to access an object inside that class all u have to do is to use instance of that class followed by . , just like java*/