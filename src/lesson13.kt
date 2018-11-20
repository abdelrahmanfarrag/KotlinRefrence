fun main(args : Array<String>){
    val user1 = User(name = "AHMED",id = 1)
    val user2 = User(name = "ABDELRAHMAN",id = 2)

    if (user1.equals(user2)) {
        print(true)
    }else{
        print(false)
        val user3 = user2.copy(name = "MOHAMED")
        print(user3.name)
    }

}


data class User(var name:String,var id : Int)


/* Lesson notes
* Data class is a class This type of class can be used to hold the basic data apart.
 * Other than this, it does not provide any other functionality.
 * Any class in kotlin is derived from "Any" which provide threee methods :
 * 1- toString():String ,2- equals():Boolean ,3- hashCode():Int
 * to make data class , you have to mark a class by "data" keyword .
 * the primary constructor of data class MUST have at least one property .
 * data class provides copy() which is used to copy a value of instance of data class to another
 * it compares values of object , no the object itself.
 * */