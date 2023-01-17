fun main() {
    var lieblingsFilme: List<String> = listOf("Batman", "Breaking Bad", "Attack on Titan", "Planet der Affen")
    println(lieblingsFilme.size)
                   // Verbesser die For-schleife, sodass alle Filme der Liste lieblingsFilme ausgegeben wird.
   for ( i in 0 until lieblingsFilme.size)
    println(lieblingsFilme[i])
     //for ( i in 0 .. lieblingsFilme.size -1)
}