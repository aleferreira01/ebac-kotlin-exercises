package fundamentals

fun main() {
    var mutableValue: Int = 6
    mutableValue = 5
    println(mutableValue)

    val immutableValue: Int = 6
    // immutableValue = 7           Val cannot be reassigned
}