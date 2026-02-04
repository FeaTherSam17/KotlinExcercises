import kotlin.math.sqrt

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {

//    //multiplicacionArreglo()
//
//    if(palindromo("lol")){
//        println("Es palinfromo")
//    }else
//        println("No es palindomor")
//
//    //Numero primo
//    val numero = 6
//    if (numeroPrimo(numero)){
//        println("${numero} Es un numero primo")
//    }else
//        println("$numero no es un numero primo ")
//
//    //Numero perfecto
//    if (numeroPerfecto(numero)){
//        println("$numero es un numero perfecto")
//    }else
//        println("$numero no es un numero perfecto")
//

//        areaTriangulo(5,6)
//        areaCirculo(5)
//        calcularIGV(100)
//        horasAminutosSegundos(5)
//        numerosEnterosEnIntervalo(10,19)
//        sumaCuadradosNaturalesCiclo(5)
//        sumaCuadradosNaturales(5)
//        calcularSalarioQuicenal(50,18.5)
//        inversoNumero(246)
//        terminoSucesion()
    //segundoGrado()
    //descuentoCompra()
    //parImpar()
    //multiploDeTresCinco()
    //terminoCifra()
    //ordenarNumeros()
    //trianguloSegunLados()
    //diasParaTerminarElAnio()
    //mostrarEstadoNotas()
    //convertirUnidadesMasa()
    //determinarCaracterVocal()
    aforoLocalPermitido()
}

private fun aforoLocalPermitido(){
    /*Realizar un programa que permita ingresar la cantidad de personas que se encuentran en un supermercado.
    * Debido a la pandemia, el aforo es del 40% y su totalidad es de 200. El programa deberá indicar si el aforo es aceptable, está a tope, ha sido sobrepasado*/

    val aforo=200
    println("Ingresar el número de personas")
    val numeroPersonas = readln().toInt()

    val estado = when{
        aforo*.40 > numeroPersonas -> "Aceptable"
        aforo *.40 == numeroPersonas.toDouble()->"A tope"
        aforo *.40 < numeroPersonas->"Sobrepasado"
        else -> "Intentalo de nuevo"
    }
    println(estado)

}

private fun determinarCaracterVocal(){
    /*Dado un caracter, determinar si es una vocal*/
    println("Ingresa una letra")
    var letra = readln().lowercase().first()//Obtener el primer caracter

    when(letra){
        'a','e','i','o','u' -> println("Es una vocal")
        else -> println("No es una vocal")
    }


}

private fun convertirUnidadesMasa(){
    /*
    * Hacer un programa que pase de gramos a otras unidades de masa con un menú
    *
    * Kilogramo = 1000g
    * Libras = 453.592g
    * Onzas = 28.3495g
    * Miligramo = g/1000
    *
    * */

    //Creación del menú
    println("Ingrese el número de gramos a convertir!")
    val gramos = readln().toDouble()

    println("**************************************************************")
    println("***             INGRESE UN NÚMERO DEL MENÚ                 ***")
    println("*** 1. Kilogramos                                          ***")
    println("*** 2. Libras                                              ***")
    println("*** 3. Onzas                                               ***")
    println("*** 4. Miligramos                                          ***")
    println("**************************************************************")
    val opcionMenu = readln().toInt()

    when(opcionMenu){
        1->{println("$gramos gramos son ${gramos/1000} kilogramos")}
        2->{println("$gramos gramos son ${gramos/453.592} libras")}
        3->{println("$gramos gramos son ${gramos/28.3495} onzas")}
        4->{println("$gramos gramos son ${gramos*1000} miliramos")}
        else -> println("Opción inválida")
    }
}

private fun mostrarEstadoNotas(){
/*Pedir una nota de 0 a 10 y mostrarla de la forma: Desaprobado, aprobado y excelente
* usando...
* 0-3 -> Desaprobado
* 4-7 -> Aprobado
* 8-10 -> Excelente!!
* Cualquier otro caso -> Respuesta errónea
* */

    val nota: Int
    val respuesta:String

    println("Ingresa la nota")
    nota = readln().toInt()

    when(nota){
        in 0..3->{respuesta = "Desaprobado :(("}
        in 4..7 ->{respuesta = "Aprobado"}
        in 8..10->{respuesta = "Excelente!!"}
        else -> {respuesta = "Respuesta errónea"}
    }
    println(respuesta)

}

private fun diasParaTerminarElAnio() {

    println("Ingrese el día")
    val dia: Int = readln().toInt()
    println("Ingrese el mes")
    val mes: Int = readln().toInt()
    println("Ingrese el año")
    val anio: Int = readln().toInt()

    var diasRestanes: Int

    /*
      * Meses con 31 días
      * enero, marzo, mayo, julio, agosto, octubre, diciembre
      *
      * Meses con 30 días
      * nobiembre, abril, junio y septiembre
      *
      * */
    val mesDias = arrayOf(0,31,28,31,30,31,30,31,31,30,31,30,31)

    //We sum since the month entered until the final month, then we suscract the day
    diasRestanes = mesDias.sliceArray(mes..12).sum()-dia

    if (determinarBiciesto(anio)){
        println("Faltan ${diasRestanes+1} para terminar el año")
    }else{
        println("Faltan ${diasRestanes} para terminar el año")
    }

}



/*Determinar su un año es biciesto, este debe ser divisible por 4,
excepto para aquellos años divisibles por 100 pero no por 400

Un año biciesto tiene un día más = 366 días
*/

private fun determinarBiciesto(anio:Int): Boolean{
   if ( (anio%4==0 && anio%100!=0) || anio%400==0  ){
       return true
   }else{
       return false
   }
}

private fun trianguloSegunLados(){
    println("Ingrese el primer lado del triangulo")
    val lado1 = readln().toFloat()
    println("Ingrese el segundo lado del triangulo")
    val lado2 = readln().toFloat()
    println("Ingrese el tercer lado del triangulo")
    val lado3 = readln().toFloat()

    /*Casos:
    * Equiláterlo = 3 lados iguales
    *
    * Isósceles = 2 lados iguales
    *
    * Escaleno = 3 lados diferentes
    * */

    if (lado1 == lado2 && lado2 == lado3){
        println("El triángulo es Equilátero")
    }else if (lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
        println("El triángulo es Iscóceles")
    }else{
        println("El triángulo es Escaleno")
    }
}

private fun ordenarNumeros(){
    println("Ingresa el primer número")
    val num1 = readln().toInt()

    println("Ingresa el segundo número")
    val num2 = readln().toInt()

    println("Ingresa el tercer número")
    val num3 = readln().toInt()

    if (num1>num2 && num1>num3){//Indica que número 1 es mayor
        if (num2>num3){//1,2,3
            imprimirOrdenNumeros(num1,num2,num3)
        }else{
            imprimirOrdenNumeros(num1,num3,num2)
        }
    }else if(num2>num1 && num2 > num3){//Indica que numero 2 es mayor
        if (num1>num3){
            imprimirOrdenNumeros(num2,num1,num3)
        }else{
            imprimirOrdenNumeros(num2,num3,num1)
        }
    }else{//Indica que numero 3 es mayor
        if (num1>num2){
            imprimirOrdenNumeros(num3,num1,num2)
        }else{
            imprimirOrdenNumeros(num3,num2,num1)
        }
    }
}

private fun imprimirOrdenNumeros(num1:Int,num2:Int,num3:Int){
    println("Los números ordenados de forma descendente son: $num1, $num2, $num3")
    println("Los números ordenados de forma ascendente son: $num3, $num2, $num1")
}

private fun terminoCifra(){
    println("Enter a number")
    val number = readln()!!.toInt()
    if (number%10==0){
        println("The number ends in 0")
        println("${number/2}")
    }else
        println("The number don't ends in 0")
        println("${number*2}")
}

private fun multiploDeTresCinco(){
    println("Enter a number")
    val number = readln()!!.toInt()

    if (number%3==0 && number%5==0){
        println("$number is multpliplo de 3 y de 5")
    }else{
        println("$number is not multiplo de 3 y 5")
    }

}

private fun parImpar(){
    println("Enter the number! ")
    val number = readln()!!.toInt()
    if(number%2==0){
        println("The number is pair")
    }else
        println("The number is not pair")
}

private fun descuentoCompra(){
    //Calcular el descuento de una compra
    /*En steam se hace un 50% de descuento a las personas cuya compra sea mayor a 100$. indicar el monto descontado y el dscuento*/
    println("Insert the price of the game")
    val gamePrice = readln()!!.toDouble()
    if (gamePrice>100){
        println("This game has 50%!!")
        val discount = gamePrice - (gamePrice*.50)
        println("The final price is: $discount")
    }else{
        println("This game doesn't have discount ;(")
        println("The price to pay is: $gamePrice")
    }


}
private fun segundoGrado(){
     println("Ingrese el coeficiente de segundo grado")
    val a = readln()!!.toDouble()
    println("Ingrese el coeficiente de grado uno")
    val b = readln()!!.toDouble()
    println("Ingrese el coeficiente de grado cero")
    val c = readln()!!.toDouble()

    val raiz = sqrt(b*b - (4*a*c))
    val x1 = (-b + raiz)/2
    val x2 = (-b - raiz)/2

    println("El valor de X1 es: $x1")
    println("El valor de X2 es: $x2")
}


//Halle N en esta sucesión de segundo grado. Si M tiene 20 números
private fun terminoSucesion(){
    println("Digite los numeros de la sucesión:")
    println("Ingrese el primer número")
    var num1 = readln()!!.toInt()

    println("Ingrese el segundo número")
    var num2 = readln()!!.toInt()

    println("Ingrese el tercer número")
    var num3 = readln()!!.toInt()

    println("Ingrese el cuarto número")
    var num4 = readln()!!.toInt()


    println("Qué término desea hallar?")
    var nTermino = readln()!!.toInt()

    var r1 = (num4-num3)-(num3-num2)
    var r2 = (num2-num1) - r1
    var t0 = num1 -r2

    var a = r1/2
    var b = r2-a
    var c = t0

    var rpta = a * (nTermino*nTermino)+(b*nTermino)+c
    println("El $nTermino es igual a $rpta")
}

//Dado un número de 3 cifras, devolver el inverso del número. Eje.: Si ingresamos 246 debe mostrar 642
private fun inversoNumero(numero: Int){
    println("El inverso del número es: ${numero.toString().reversed()}")
}

//Calcular e imprimir el salario quincenal de un empleado a partir de sus horas trabajadas
//y de su salario por hora
private fun calcularSalarioQuicenal(horas: Int,salarioPorHora: Double){
    val salarioQuincenal = horas*salarioPorHora
    println("El salario quincenal de una persona que trabaja $horas horas y que tienen un salario por hora de: $salarioPorHora es: $salarioQuincenal")
}

private fun sumaCuadradosNaturales(numero: Int){
    val sumaCuadrados = (numero*(numero+1)*(2*numero+1))/6
    println("La suma de los cuadrados de los numeros naturales hasta $numero es: $sumaCuadrados")

}

private fun sumaCuadradosNaturalesCiclo(numero: Int){
    var sumaCuadrados = 0
    for (i in 0..numero){
        sumaCuadrados += i*i
    }
    println("La suma de los cuadrados de los numeros naturales hasta $numero con ciclo es: $sumaCuadrados")

}

private fun numerosEnterosEnIntervalo(numeroMenor:Int, numeroMayor: Int){
    val numerosIntervalo = (numeroMayor - numeroMenor)-1
    println("La cantidad de números entre el intervalo de $numeroMenor a $numeroMayor son: $numerosIntervalo")
}
private fun horasAminutosSegundos(horas:Int){
    var minutos = 0
    var segundos = 0

    minutos = horas *60
    segundos = horas * 3600

    println("$horas horas equivalen a $minutos minutos")
    println("$horas horas equivalen a $segundos segundos")
}

private fun calcularIGV(producto: Int){
    println("El precio inicial es $producto")
    println("El IGV es 18")
    val precioFinal = producto - (producto*.18)
    println("El precio final es: ${precioFinal}")
}
private fun areaCirculo(radio:Int){
    println("El area del circulo es: ${Math.PI*radio*radio}")
}

private fun areaTriangulo(base:Int, altura:Int){
    println("El área del triangulo es: ${(base*altura)/2}")
}

private fun multiplicacionArreglo(){
    println("Programa que permite Multiplicar los elementos de un arreglo excepto el del indice")

    //Creación del arreglo original
    val array = arrayOf(1,2,3,4)
    val arrayResult = Array(4){1}


    //Recorrido del primer arreglo
    for (i in 0..arrayResult.size-1) {//Recorrido del primer arreglo
        for (j in 0..array.size - 1) {

            if (i!=j){
                arrayResult[i] *= array[j]
            }
        }
    }
    println(arrayResult.contentToString())
}

private fun palindromo(palabra: String): Boolean{
    val mitad = palabra.length/2
    val inverso = palabra.reversed()

    for (i in 0..mitad){
        if (!palabra.get(i).equals(inverso.get(i))) return false
    }
    return true
}

private fun palindromoCorrecto(palabra: String): Boolean{
    val inverso = palabra.reversed()
    return palabra.equals(inverso)
}

private fun numeroPrimo(number:Int): Boolean{

    if (number>0){
        var veces = 0
        for (i in 1..number){
            if (veces > 2) return false
            if (number % i == 0) veces+=1
        }
    }else
        return false
    return true
}

private fun numeroPerfecto(numero: Int): Boolean{
    if (numero <= 1) return false // uno no es perfecto
    else{
        val divisores = mutableListOf<Int>()
        for (i in 1..numero/2){
            if(numero%i == 0) divisores.add(i)
        }
        return divisores.sum() == numero
    }
}