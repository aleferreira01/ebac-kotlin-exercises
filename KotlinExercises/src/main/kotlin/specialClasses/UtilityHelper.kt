package specialClasses

object UtilityHelper {
    private var currentDay: DayOfWeek = DayOfWeek.SUNDAY

    fun currentDay() = println("Dia da semana: $currentDay")
    fun setCurrentDay(newDayOfWeek: DayOfWeek) {
        this.currentDay = newDayOfWeek
    }

    fun isWeekend() = currentDay == DayOfWeek.SATURDAY || currentDay == DayOfWeek.SUNDAY
}