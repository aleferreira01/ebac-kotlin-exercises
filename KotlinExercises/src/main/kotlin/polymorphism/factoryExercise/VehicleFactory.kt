package polymorphism.factoryExercise

class VehicleFactory {

    fun createAVehicle(type: Int, model: String): Vehicle {
        return when (type) {
            1 -> Car(model)
            else -> Motorcycle(model)
        }
    }

}