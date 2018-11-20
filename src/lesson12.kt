fun main(args : Array<String>){

  TestingInterfaces()

}


interface MyFirstInterface{
    fun onClick() //1- all functions in interface are abstract by nature
    fun onTouch(){
        //2- unlike java, interfaces may hold normal functions
        println("Hello , Iam exploring interfaces in kotlin -- interface one")
    }
    var name :String  //3- properties in interfaces are abstract
}

interface MySecondInterface {
    fun onTouch(){
        println("Hello , Iam exploring interfaces in kotlin -- interface second")
    }

}


class TestingInterfaces : MyFirstInterface,MySecondInterface{
    override var name: String ="Hello , Iam exploring properties in kotlin within interfaces !!"

/*4- if there are two method inside two interfaces with the same name , so you MUST override it , and to differentiate between them
     call super<InterfaceName>.MethodName
  */
    override fun onTouch() {
        super<MyFirstInterface>.onTouch()
        super<MySecondInterface>.onTouch()
        println("Implemented interface methid inside class")

    }

    override fun onClick() {
        println("Clicked")
    }

    init {
        onTouch()
        onClick()
        println("$name")
    }

}
