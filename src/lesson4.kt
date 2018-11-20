fun main (args :Array<String>){
    val from1To5Range = 1..5
    println(from1To5Range)

    val from5To1Range = 5 downTo  1
    println(from5To1Range.toList().size)

    val printOddNumbers = 5 downTo 1 step 2
    println(printOddNumbers.toList().size)

    val printAlphabetChars = 'a'..'z'
    println(printAlphabetChars.toList().size)

    val isCharPresent = 'x' in printAlphabetChars
    println("result is : $isCharPresent")

    val isNumberPresent = 10 in from1To5Range
    println("result is : $isNumberPresent")

}
/*Lesson notes
* ranges is something like array it takes a set a values but it iterate on each element present in that range.
* ".." => this called double dot operator it specify start and end point of range
* to check availability of element inside range use "in" operator which return a value of true if found ,false if not*/