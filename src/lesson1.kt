fun main(args: Array<String>) {
    var name = "Hello"
    var secondaryName: String

    secondaryName = "World"
    val age = 25
}

/*
* Lesson notes
* 1- to create variable use keyword var
* 2- you can not give it a type as kotlin explicitly know the type of variable
* 3- if you want to declare a variable that u give a value in future then you must identify its type
* 4- when variable has a constant value then use "val" keyword instead of "var
* 5- once u declared val then u can not change its value in future
* 6- REPL : stands for Read-Eval-Print-Loop , its usage is open terminal and write code you want inside it
*     and execute it as fast as possible
*     to open REPL = tools > kotlin > kotlin reple
*     to execute Written code of repl ctrl+enter
* 7- All data types inside Kotlin consider as OBJECTS so , any variable must have initialize , and all data type
     starts with Capital letter ,and each data type has no default value
* 8- Data types available in kotlin {"Boolean(1 bit)" , "Byte(8 bit)","Char(16 bit)","Int(32 bit)","Float(32 bit)"
*    "Long(64 bit)","Double(64 bit)"}
* 9- all variables inside kotlin considered as "Mutable" that means it can be modified
* 10- all values inside kotlin considered as "immutable" that means it CANNOT be modified
     */