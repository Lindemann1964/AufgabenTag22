fun main() {
    var numbers: MutableList<Int> = mutableListOf(3, 6, 4, 7, 42, 1, 26)
    for ( i in 0 until numbers.size){
        numbers[i] = numbers[i] + 5
println(numbers[i])

    }
    println(numbers)

}






















// n dieser Aufgabe sollst du eine For-Schleife schreiben, die die Liste numbers durchläuft, die jeweilige Zahl liest, es um 5 erhöht und dann wieder an der Stelle in der Liste speichert. Gib nach der Schleife die Liste in der Konsole aus und überprüfe dein Ergebnis.
//Wurden alle Zahlen um 5 erhöht?