fun main() {
    var fruits: List<String> = listOf("Strawberry", "Apple", "Banana", "Lemon")
    for (Element in fruits ){
        println(Element)

    }
    var i = 0
    do {
        var einzelfrucht= fruits [i]
       println(einzelfrucht)
        i++

    }
        while (i<=3)     //i < fruits.size


}






//Gib den Inhalt der Liste fruits einmal mithilfe einer For-Schleife und einmal mithilfe einer Do-While-Schleife in der Konsole aus.
//
//Du darfst nicht die ganze Liste einfach als Parameter der println()-Funktion übergeben, sondern sollst mithilfe der Schleifen durch die Elemente der Liste durchgehen und diese ausgeben.
//
//Das ist verboten: println(fruits)
//In der Konsole sollte dann folgendes ausgegeben werden:



//Strawberry
//Apple
//Banana
//Lemon
//Strawberry
//Apple
//Banana
//Lemon