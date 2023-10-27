package fundamentals

fun main() {

    val numbersArray = IntArray(40)

    for (i in 1..numbersArray.size - 1) {
        numbersArray[i] = i
        println(numbersArray[i])
    }

    println()

    val numbersList: MutableList<Int> = mutableListOf()

    for (i in 1..99) {
        numbersList.add(i)
        println(numbersList[i-1])
    }

    var sum = 0

    for (i in numbersList) {
        sum += i
    }

    println("Soma: $sum")

}