package com.example.myapplication

fun main(){
    val maritalStatus:Int = 0;
    checkPersonMaritalStatus(maritalStatus)
}

fun basicIf(myName:String){
    if(myName != "Pablo"){
        println("$myName isn't the name of the author, It's Pablo")
    }else{
        println("Good, $myName is the author of the project")
    }
}

/*Example of nested if*/
fun checkPersonMaritalStatus(option:Int){
    if(option == 1){
        println("The person is married")
    }else if(option == 2){
        println("The person is common-law marriage")
    }else if (option == 3){
        println("The person is single")
    }else{
        println("Type a valid option")
    }
}

/*Boolean case*/
fun checkIfPersonIsHappy(){
    val happy:Boolean = true

    //!happy --> happy = false
    //happy --> happy = true
    if(!happy){

    }
}

/*Double condition AND*/
fun checkIfPersonMeetsRequiredAgeAndHeight(personAge:Int, personHeight:Float){
    if(personAge >= 18 && personHeight >= 1.70f){
        println("You may proceed to the ride")
    }else{
        println("You may not proceed to the ride")
    }
}

/*Double condition OR*/
// Use --> || between propositions

/*Multiple codition*/
// --> condition1 && (condition2 || condition3)