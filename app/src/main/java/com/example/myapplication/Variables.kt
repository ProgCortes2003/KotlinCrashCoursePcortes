package com.example.myapplication

fun add(number1:Int, number2:Int){
    println(number1 + number2)
} // --> This function doesn't return any value only receive parameters (input)

fun subtract(number1:Int, number2:Int):Int{
    return number1 - number2
}// --> While this function return a value (output)

fun showMyName(name:String){
    println("Hello, my name is $name")
}

fun main(){
    var person01Age:Int = 20
    var person02Age:Int = 30

    //addTwoNumbers(person01Age, person02Age)

    var myName:String = "Louise"

    showMyName(myName)
    val agesSubtract = subtract(person01Age, person02Age)
    println(agesSubtract)
}