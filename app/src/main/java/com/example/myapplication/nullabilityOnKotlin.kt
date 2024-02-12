package com.example.myapplication

/*
* often, there are variables that are null variables. In other words variables that does not have a value*/

fun main(){

    val myName:String? = null
    //So, android studio is sensible with null variables.
    //For that, the IDE provides us of tools for handling null variables without problems?

    /*
    * ? at the of kind value --> says the program: Hey bro, this could be null!
    *
    *   //println(myName!![3])
    *
    * !! at the end of variable invokating --> says the program: !Hey bro, I'm so sure that this variable never will be null
    * The problem of the previous resource is when the variable be null throw us the exception --> pointer.null.exception.
    **/

    print(myName?.get(3) ?: "The variable is null, I don't do anything")

    /*
    * It's better use in the instructions de question symbol.
    * The question symbol creates a kind of condition where the program only execute the instruction if the variable not be null.
    * */

    /* :? instruction --> says the program: Hey bro! if the variable is null, do follows
    * */

}