package Functions

fun main() {

    println("Resultado da soma: ${sum(30, 15)}")
    println("Resultado da multiplicação: ${multiplication(25, 5)}")

    println()

    println("Cálculo com a função de soma: ${calculator(512, 8, ::sum)}")
    println("Cálculo com a função de multiplicação: ${calculator(512, 8, ::multiplication)}")
    println("Cálculo com a função de subtração: ${calculator(512, 8, subtraction)}")
    println("Cálculo com a função de divisão: ${calculator(512, 8, division)}")

}

fun sum(value1: Int, value2: Int): Int {
    return value1 + value2
}

fun multiplication(value1: Int, value2: Int) = value1 * value2

val subtraction: (Int, Int) -> Int = { val1, val2 -> val1 - val2 }

val division = { val1: Int, val2: Int -> val1 / val2 }

fun calculator(value1: Int, value2: Int, operationFunc: (Int, Int) -> Int): Int {
    return operationFunc(value1, value2)
}