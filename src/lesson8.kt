/*THIS IS NO CODING LESSON
* lesson about interoperability between java & kotlin
* This means that any code in java is running on kotlin and vice-versa
* any kotlin method is considered as Public by default , but how java and kotlin see the code of each other O.o ?
* well , in java , in compile time compiler transforms code of .java that you created to .class that is byte code
* which can be read by JVM which transforms it into running application .
* in kotlin , it the same process , except compiler transforms .kt you created to kt.class that is byte code and put it
* inside wrapper class that have the same name of file .kt you written , for example if you created file and named it
* hellokotlin.kt , in compile time it will be HelloKotlinKt.class , then JVM transforms it into running application
* to change the name of this wrapper class all you have to do , in the beginning of the add this line
* @file:JvmName("YOUR TITLE OF WRAPPER CLASS")*/