package exercises

/*
* MOBILE NOTIFICATIONS
*
* Typically, your phone provides you with a summary of notifications.

*In the initial code provided in the following code snippet, write a program that prints the summary message based on the number of notifications that you received. The message should include:

*The exact number of notifications when there are less than 100 notifications.
*99+ as the number of notifications when there are 100 notifications or more.

* */

fun main(){
    val morningNotificationAmount = 0
    val eveningNotificationAmount = 135

    printNotificationSummary(morningNotificationAmount)
    printNotificationSummary(eveningNotificationAmount)
}

fun printNotificationSummary(notificationAmount:Int){
    if(notificationAmount >= 100){
        println("Your phone is blowing up! You have 99+ notifications.")
    }else if(notificationAmount < 0){
        println("Error the notification number would not be less than 1")
    }else if(notificationAmount == 0){
        println("You don't have notifications.")
    }else{
        println("You have $notificationAmount notifications.")
    }
}

/*
other way
 */
/*
fun printNotificationSummary(notificationAmount:Int){

    when(notificationAmount){
        in 1..99 -> println("You have $notificationAmount notifications.")
        else -> if(notificationAmount < 1){
            println("Error the notifications would not be less than 1")
        }else{
            println("Your phone is blowing up! You have 99+ notifications.")
        }
    }

}
*/
