fun main() {

    val number = 88
    var evenOrOdd: String

    evenOrOdd = if (number % 2 == 0) {
        "O número é par"
    } else {
        "O número é impar"
    }

    println("Com if: $evenOrOdd")

    evenOrOdd = when {
        number % 2 == 0 -> "O número é par"
        else -> "O número é impar"
    }

    println("Com when: $evenOrOdd")

}