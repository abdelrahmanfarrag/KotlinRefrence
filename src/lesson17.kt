fun main (args:Array<String>){
    var person = Person()
    with(person){
        name = "Hello world"
        age = 15
    }
    person.apply {
        name = "Hello from apply"
        age = 25
    }.testingApply()
}
class Person{
    var name:String =""
    var age:Int = 0

    fun testingApply(){

    }
}
/* Lesson notes
* with,apply : when need to access property of a class we repeating usage of instance of class ,instead of repeating calling
* of instance of class , we using lambdas (with,apply)
* the difference between with , apply = that apply returns a receiver so you can call methods using "apply" , while you CAN NOT
* call functions using "with".
* */