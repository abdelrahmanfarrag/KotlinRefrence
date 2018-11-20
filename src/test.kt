fun main(args : Array<String>){
    var lambda = Lambdas()

    lambda.lambdasExpress(4,6) { a, b -> println(a+b)}

    lambda.appendingChars("ab","cd"){a,b -> print("$a   $b")}

    lambda.reversedResp({it.reversed()},"Hello")

}
class Lambdas{
    fun lambdasExpress(a:Int,b:Int,addingLambda : (Int,Int)->Unit){
        addingLambda(a,b)
    }

    fun appendingChars(a:String,b:String, appendingLambda :(String,String) ->Unit){
        appendingLambda(a,b)
    }

    fun reversedResp (reverse : (String)->String, word :String){
        println(reverse(word))
    }
}