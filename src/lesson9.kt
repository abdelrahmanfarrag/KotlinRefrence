import java.math.BigInteger

fun main(args : Array<String>){

   println("${defaultArguementsFunction(2,3)}")

    println("${defaultArguementsFunction(c= 11, a = 3 ,b = 10)}")

    println("${7.extentionFunctionExample(8)}")

    println("${7 extentionFuntionWithInfinixExample 10}")
    println("${getFabionecci(10000, BigInteger("1"), BigInteger("2"))}")

}

@JvmOverloads
fun defaultArguementsFunction(a:Int,b:Int,c:Int = 10):Int{
    return a+b+c
}

fun Int.extentionFunctionExample (a:Int) : Int{
    return this+a
}

infix fun Int.extentionFuntionWithInfinixExample(a:Int) :Int{
    return this+a
}

 tailrec fun getFabionecci(n:Int,a :BigInteger, b:BigInteger) : BigInteger {
     if (n == 0) {
         return b
     } else {
         return getFabionecci(n - 1, a + b, a)
     }
 }


/*Lesson notes
* basic function syntax
*  fun nameofFunction (){}
*  if function returns nothing then it returns Unit which you do not have to write it
*  if it returns data type such as integer
*  func nameOfFunction():Int {}
*  default Arguement func : is to give a parameter inside the function a default value , then when call function you do not have
*  to include this parameter
*  NOTE : THIS FEATURE IS NOT INCLUDED IN JAVA , THEN IF YOU WANT THIS METHOD TO BE READ IN JAVA FILES WITHOUT ERRORS THEN
*  YOU MUSSST PUT THIS ANNOTATION ABOVE THE METHOD @JvmOverLoads
*
*  extension function : is to add a method or feature to sdk or existing class just like examples above extentionFunctionExample
*  this method had added to Int class methods
*
*  infix function : all infix functions are extension functions , but all extension functions NOT infix function
*  it used to simplify calling of extension function just as line 11
*
*  tailrec function : is a recursion function but in optimized way , kotlin had added it to solve "stackOverflow issue"
*  example of it is getFabionecci function !
*  */