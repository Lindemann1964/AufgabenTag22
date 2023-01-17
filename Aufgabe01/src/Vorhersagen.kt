fun main() {
    var ergebnis: Int = 0
    var i: Int = 0
    do {
        ergebnis += i // die Summe aller Zähler
        i++           // Nur der Zähler selbst
    } while (i <= 5) // Zähler wird überprüft ob er kleiner=5 bzw.6
    println(i)       // gibt denn letzten Wert des Zählers 6 aus
}