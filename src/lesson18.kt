fun main(args :Array<String>){


    val name :String? = null
    println("the length of name is ${name?.length}")
    val list = listOf(2,4,5,20,4,6,8,100,200)
    val smallerNumbers = list.filter { it < 20 }
    for (value in smallerNumbers){
        println(value)
    }

    val list2 = listOf(1,2,3,5,6,7,8,1,21,52315,12)
    val sNumbers = list2.map { it * it }
    for (value in sNumbers){
        println(value)
    }

    val list3 =  listOf(1,2,3,4,5)
    val squaredNumbers = list3.filter { it<3 }
            .map { it * it }

    for (value in squaredNumbers){
        println(value)
    }
}
