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
