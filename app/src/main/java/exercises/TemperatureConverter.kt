package exercises
/*
* TEMPERATURE CONVERTER
*
* There are three main temperature scales used in the world: Celsius, Fahrenheit, and Kelvin.

*In the initial code provided in the following code snippet, write a program that converts a temperature from one scale to another with these formulas:

    *Celsius to Fahrenheit: ° F = 9/5 (° C) + 32
    *Kelvin to Celsius: ° C = K - 273.15
    *Fahrenheit to Kelvin: K = 5/9 (° F - 32) + 273.15

* */

fun main(){

    val initialUnit= "Celsius"
    val finalUnit = "Fahrenheit"
    val initialMeasurement:Double = 27.0

    if(initialUnit == "Celsius"){
        when(finalUnit){
            "Fahrenheit" -> printFinalTemperature(initialMeasurement,initialUnit,finalUnit,{initialMeasurement:Double
            -> (1.8*initialMeasurement)+32})
            //(9/5) --> this integer number will be convert 1. That was the error. The program rounds 1, when the exact value of 9/5 in decimal is 1.8
        }
    }

}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}
