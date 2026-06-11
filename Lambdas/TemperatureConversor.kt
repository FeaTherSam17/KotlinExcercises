/*En el mundo, se usan tres escalas de temperatura principales: Celsius, Fahrenheit y Kelvin.

En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa que convierta una temperatura de una escala a otra con estas fórmulas:

    De grados Celsius a Fahrenheit: °F = 9/5 (°C) + 32
    Kelvin a Celsius: °C = K - 273.15
    De Fahrenheit a Kelvin: K = 5/9 (°F - 32) + 273.15
 */
//Ten en cuenta que el método String.format("%.2f", /* measurement * /  ) se usa para convertir un número en un tipo String con 2 decimales.

/*
27.0 degrees Celsius is 80.60 degrees Fahrenheit.
350.0 degrees Kelvin is 76.85 degrees Celsius.
10.0 degrees Fahrenheit is 260.93 degrees Kelvin. */
fun main() {
    // Fill in the code.
    //Definimos las funciones lamba para cada conversion, de tipo (Double) -> Double, es decir, reciben un Double y devuelven un Double
    //Se necesita que los numeros de una division sean Double para evitar que se redondeen a enteros, por eso se ponen 9.0 y 5.0 en lugar de 9 y 5
    val celciusToFahrenheit:(Double) -> Double = { celsius -> (9.0/5.0) * celsius + 32}
    val kelvinToCelcius:(Double) -> Double = { kelvin -> kelvin - 273.15 }
    val fahrenheitToKevin:(Double) -> Double = {fahrenheit -> (5.0/9.0)*(fahrenheit - 32) + 273.15}
    
    printFinalTemperature(27.0, "Celsius", "Fahrenheit", celciusToFahrenheit)
    printFinalTemperature(350.0, "Kelvin", "Celsius", kelvinToCelcius)
    printFinalTemperature(10.0, "Fahrenheit", "Kelvin", fahrenheitToKevin)
}


//Funcion que recibe la temperatura inicial, la unidad inicial, la unidad final y la Formula de conversion para imprimir el resultado de la conversion
//Funcion de orden superior, recibe una funcion lambda como parametro, que es la formula de conversion, de tipo (Double) -> Double, es decir, recibe un Double y devuelve un Double
fun printFinalTemperature(
    initialMeasurement: Double, 
    initialUnit: String, 
    finalUnit: String, 
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}

