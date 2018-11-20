fun main(args :Array<String>){
    var prog = Program()
    prog.add(2,6,object :Execute{
        override fun executeSum(sum: Int) {
            print("The sum of numbers is $sum")
        }

    })
}
class Program{
    fun add(a:Int,b:Int,action:Execute){
        val sum = a+b
        action.executeSum(sum)
    }
}

interface Execute{
    fun executeSum(sum :Int)
}
/* Lesson notes
*In this lesson , i cover the basics of High-level functions , and lambdas expression
* High-level function : is a function that satisfies one of three conditions :
* 1- accepts function as parameter
* 2- returns function
* 3- accepts function as parameter, and returns function
*
* Lambdas : in simple words, Lambdas is just a function with no name !
* i will cover the topic of High-level and lambdas in more than one file , in this file i covered the concept and OOP way using
* interface
* */
