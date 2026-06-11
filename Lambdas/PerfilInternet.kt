/*
 * A menudo, debes completar los perfiles de sitios web en línea que contienen campos obligatorios y no obligatorios. 
 * 
 * Por ejemplo, puedes agregar tu información personal y un vínculo a otras personas que te refirieron para que registraras tu perfil.

En el código inicial que se proporciona en el siguiente fragmento de código, escribe un programa que imprima los detalles del perfil de una persona.
 */

fun main() {    
    val amanda = Person("Amanda", 33, "play tennis", null)
    val atiqah = Person("Atiqah", 28, "climb", amanda)
    
    amanda.showProfile()
    atiqah.showProfile()
}


class Person(val name: String, val age: Int, val hobby: String?, val referrer: Person?) {
    fun showProfile() {
       // Fill in code 
       println("Name: $name")
       println("Age: $age")
       if(referrer != null){
          println("Likes to play $hobby. Has a reffer named ${referrer.name}, who likes to play ${referrer.hobby} \n")
       }else{
        println("Likes to play $hobby. Doesn't have a referrer.\n")
       }
    }
}
