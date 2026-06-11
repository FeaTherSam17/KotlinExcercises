/*
 * Imagina que necesitas crear una app de reproducción de música.

Crea una clase que pueda representar la estructura de una canción. La clase Song debe incluir estos elementos de código:

    Propiedades para el título, el artista, el año de publicación y el recuento de reproducciones
    Propiedad que indica si la canción es popular (si el recuento de reproducciones es inferior a 1,000, considera que es poco popular)
    Un método para imprimir la descripción de una canción en este formato:

"[Título], interpretada por [artista], se lanzó en [año de lanzamiento]".
 */
class Song(
    title:String,
    artist:String,
    releaseYear:Int,
    playCount:Int
){
    val title = title
    val artist = artist
    val releaseYear = releaseYear
    val playCount = playCount

    val isPopular:Boolean = playCount >= 1000 
    
    fun printDescription(){
        println("[$title], interpretada por [$artist], se lanzó en [$releaseYear].")
    }
}

fun main(){
    val song1 = Song(title = "Dancing in Rain", artist = "ViFeather x ERAVFT", releaseYear = 2026, playCount = 980)
    song1.printDescription()
    println("Is the song ${song1.title} popular? ${song1.isPopular}")
    val song2 = Song(title = "Our Flame", artist = "ViFeather x ERAVFT", releaseYear = 2021, playCount = 7000)
    song2.printDescription()
    println("Is the song ${song2.title} popular? ${song2.isPopular}")
}