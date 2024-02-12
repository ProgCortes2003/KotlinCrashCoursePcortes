package com.example.myapplication

/*When: It's like a powerful switch*/
fun main(){

}

/*The data type Any
*
* Any is not recommendable data type.
* Any works as any kind of value for conditions or variables.
*
* For example, looking the next function
* */

fun result(anyValue:Any){
    when(anyValue){
        is Int -> anyValue + anyValue
        /*is, like say: !Hey program do that if the value is an Integer*/
        is String -> println("the value is $anyValue")
        is Boolean -> if(anyValue){
            println("Value is true")
        }
    }
}

fun getSemester(month:Int):String {
    //We can use when for assign values of a variable
   val result = when (month) {
        in 1..6 -> "First Semester"
        in 7..12 -> "Second Semester"
        else -> "Type a valid option"
        //!in 1..12 -> "Type a valid option"
        /*range --> in 1..6 = [1,6]*/
        /*if the number not be in the range -- >!in*/
    }
    return result

    /*
    * Other amazing ways of doing the same:
    *
    * function():anyValueKind{
    *   return when() {
    *   all code
    *   }
    *
    * function() = when() {
    * all code
    * }
    **/

}

fun getTrimester(month:Int){
    when(month){
        1,2,3 -> println("First Trimester")
        4,5,6 -> println("Second Trimester")
        7,8,9 -> println("Third Trimester")
        10,11,12 -> println("Fourth Trimester")
        else -> println("Type a valid option")
    }
}
fun getMonth(month:Int){
    when(month){
        1 -> println("January")
        2 -> println("February")
        3 -> println("March")
        4 -> println("April")
        5 -> println("May")
        6 -> println("June")
        7 -> println("July")
        8 -> println("August")
        9 -> println("September")
        10 -> println("October")
        11 -> println("November")
        12 -> {println("December")
            println("Happy Merry Christmas")
        }
        else -> println("Type a valid option")
    }
}