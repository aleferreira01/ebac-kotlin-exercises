package Functions

fun main() {

    val numbersList: MutableList<Int> = mutableListOf()

    for (i in 1..99) {
        numbersList.add(i)
    }

    val evenNumbers = numbersList.filter { it % 2 == 0 }

    println("Números pares de 1 à 99: $evenNumbers")

    val names = listOf("João", "Maria", "Pedro", "Marcos")
    val greetingByName = names.map { "Olá $it" }
    greetingByName.forEach {
        println(it)
    }
}