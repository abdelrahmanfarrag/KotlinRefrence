fun main (args:Array<String>){
    //TO ACCESS Object
    Test.count
    Test.testObject()

    //TO ACCESS Companion Object

    CompanionTest.count
    CompanionTest.testObject()
}
object Test{
    var count:Int = 0
    fun testObject(){}
}

class CompanionTest{
   companion object {
        var count:Int = 0
        fun testObject(){}
    }
}

/*Lesson notes
* First, we talk about singleton concept which means that the class will have only instance for the whole application .
* in kotlin , we DO NOT have control over this object , as kotlin creates it explicitly
* in java , we have static to refer to singleton , here NO static keyword inside kotlin , instead of static we use
* Object keyword .
* in Object , the block may have properties , and methods which is acts as static , and you can access methods and properties
* using Object name only , you do not instance .
* Following the definition of Object , then you have noticed that Object DO NOT have constructor as you CAN NOT declare instance of
* classes .
* in Object , you have init{} to initiate your Object block , also it supports inheritance just as normal classes
*
* Now , lets move forward to another concept , that is "Companion Object"
* a companion object is object that is declared inside a class .
* when declase companion object you do not have to add a name to it
* you can access companion object through  the name of class contains companion object. */

