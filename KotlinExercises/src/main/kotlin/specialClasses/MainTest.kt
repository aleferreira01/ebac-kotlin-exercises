package specialClasses

fun main() {
    val name = "Marcos"
    name.convertToCharacters().map {
        println(it)
    }

    UtilityHelper.setCurrentDay(DayOfWeek.MONDAY)
    UtilityHelper.currentDay()
    println("É final de semana: ${UtilityHelper.isWeekend()}")

    UtilityHelper.setCurrentDay(DayOfWeek.SUNDAY)
    UtilityHelper.currentDay()
    println("É final de semana: ${UtilityHelper.isWeekend()}")
}

fun String.convertToCharacters(): MutableList<String> {
    val strList: MutableList<String> = mutableListOf()

    this.forEach {
        strList.add(it.toString())
    }

    return strList
}