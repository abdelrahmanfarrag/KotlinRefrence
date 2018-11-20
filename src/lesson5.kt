fun main(args : Array<String>){
    val number  = 10
    if (number>5)
        println("Hey , number you entered its value is larger than 5")
    else
        print("Hey , number you entered its value is lower than 5")


    val smallNumber = 2
    val largeNumber = 5

    val maxValue : Int = if (smallNumber > largeNumber) smallNumber else largeNumber

    println("max value is $maxValue")
}
/*Lesson notes
* this lesson talks about if statement , it is like java 100%
* the only difference between java/kotlin here that you can use if as expression just as in line 12*/