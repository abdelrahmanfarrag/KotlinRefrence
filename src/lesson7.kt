fun main (args : Array<String>){

    //Basic Syntax
    var counter  = 0
    var doWhileCounter = 0
    for (i in 1..4){
        println("current value is $i")
    }
    while (counter < 5) {
        println("current value of counter is $counter")
        counter++
    }
    do{
        println("do while current value is $doWhileCounter")
        doWhileCounter++
    }while (doWhileCounter < 5)


    //More on for loop
    //for with break
   stopThisLoop@  for (i in 1..4){
        for (j in 1..4){
           println("$j .. $i")
            if (i ==1 && j ==1){
                break@stopThisLoop
            }
        }
    }
    //for with continue
    val range = 1..5 step 2
      for (i in range){
          println("$i")
          if (i == 3) continue

    }

    /*Lesson Notes
    * iterators syntax for,while,do-while
    * while,do-while are the same as java
    * the new is in for loop that produces a new concept inside it which is labeled-for
    * let we have a loop running inside another loop , and we need to stop the outer loop if something happened
    * then we can mark outer loop (----@) and then inside inner loop (break@----)
    * break : is to stop looping when you want to stop it
    * continue : to ignore a value inside loop
    * */

}
