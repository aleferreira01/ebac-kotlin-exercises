package polymorphism.factoryExercise

fun main() {

    val factory = VehicleFactory()

    val vehicleList: MutableList<Vehicle> = mutableListOf()

    val car = factory.createAVehicle(1, "prisma")
    val motorcycle = factory.createAVehicle(0, "CG 160")

    vehicleList.add(car)
    vehicleList.add(motorcycle)

    vehicleList.forEach { vehicle ->

        vehicle.increaseVelocity()
        vehicle.currentVelocity()

    }

}