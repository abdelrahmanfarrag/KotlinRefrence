fun main(args:Array<String>){

    var result= 0
 val lambda = FirstHighLevelFunctionWithLambdaExpression()
    lambda.addWithLambdas(2,8) { s:Int -> print(s)}
    lambda.SubsTwoNumsUsingLambdaExpression(7,5) { result :Int-> println("$result")}

    val exp : (String,String)-> Unit ={res1:String,res2:String -> println("printed result is $res1  $res2")}
    lambda.sampleWithLambdaExp("Mana ","Appending result !",exp)


    lambda.anotherLambdaSample(4,7) { x:Int, b:Int -> result = x*b }
    println("result is $result")


    lambda.itExample("Hello") {it.reversed()}

}
class FirstHighLevelFunctionWithLambdaExpression {
    fun addWithLambdas(a: Int, b: Int, firstLambda: (Int) -> Unit) {
        firstLambda(a + b)
    }
    fun SubsTwoNumsUsingLambdaExpression(a:Int,b: Int,subsLamda:(Int) -> Unit){
        subsLamda(a-b)

    }

    fun sampleWithLambdaExp(secPh : String,secPh2:String, myLambda :(String,String)-> Unit){
        myLambda(secPh,secPh2)
    }

    fun anotherLambdaSample(a:Int,b:Int,multipleLambda : (Int,Int)->Unit){
        multipleLambda(a,b)
    }

    fun itExample(a:String,printLambda : (String)->String){
       val res = printLambda(a)
        println(res)
    }


}
/*Lesson notes
* to define a lambda expression it follows this structure PARAMETERS OF LAMBDA EXP -> BODY
 * in high level function body we define the type of lambda
 * example : in normal types we define something like
 * a : Int , b : String ,... etc
 * also with lambda , for lambda , if you want to make lambda that print sum just as example
 * first what lambda will take is actually Int that is the sum of two numbers
 * then , -> operator
 * finally , returning data type which in our case is Unit
 * so final of it will be firstLambda : (Int) -> Unit */