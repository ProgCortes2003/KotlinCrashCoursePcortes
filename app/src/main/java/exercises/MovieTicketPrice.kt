package exercises
/*
* Movie tickets are typically priced differently based on the age of moviegoers.

In the initial code provided in the following code snippet, write a program that calculates these age-based ticket prices:

    *A children's ticket price of $15 for people 12 years old or younger.
    *A standard ticket price of $30 for people between 13 and 60 years old. On Mondays, discount the standard ticket price to $25 for this same age group.
    *A senior ticket price of $20 for people 61 years old and older. Assume that the maximum age of a moviegoer is 100 years old.
    *A -1 value to indicate that the price is invalid when a user inputs an age outside of the age specifications.

* */
fun main(){
    val childAge = 5
    val adultAge = 30
    val seniorAge = 62

    val isMonday = true

    println("The movie ticket price for a person aged $childAge is \$${calculateMovieTicketPrice(childAge, isMonday)}.")
    println("The movie ticket price for a person aged $adultAge is \$${calculateMovieTicketPrice(adultAge, isMonday)}.")
    println("The movie ticket price for a person aged $seniorAge is \$${calculateMovieTicketPrice(seniorAge, isMonday)}.")
}

fun calculateMovieTicketPrice(age:Int,isMonday:Boolean):Int{
    var ticketPrice = 0

   when(age){
       in 1 .. 12 -> ticketPrice = 15
       in 13..60 ->
           if(isMonday){
               ticketPrice = 25
           }else{
               ticketPrice = 30
           }
       in 61..100 -> ticketPrice = 20
       else -> ticketPrice = -1
   }
    return ticketPrice
}