package polymorphism.interfaceExercise

fun main() {

    val car = Car("prisma")
    val motorcycle = Motorcycle("CG 160")

    val vehicleList: List<Vehicle> = listOf(car, motorcycle)

    vehicleList.forEach { vehicle ->

        vehicle.increaseVelocity()
        vehicle.currentVelocity()
    }
}