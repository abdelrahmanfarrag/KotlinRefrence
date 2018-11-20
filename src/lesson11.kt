fun main (args:Array<String>){
My()
}
 abstract class Anim{
     abstract var name : String
   abstract fun testAbstraction()
     abstract fun testAbstraction2()
     init {
         testAbstraction()
         testAbstraction2()
     }
}
class My:Anim()
{
    override var name: String = "Hello from the otherSide"

    override fun testAbstraction() {
        print("Test abstract 1 implemented")
        print("$name")

    }

    override fun testAbstraction2() {
        println("Test abstract 2 implemented")
    }

}