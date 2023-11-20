package polymorphism.factoryExercise

class Motorcycle(model: String) : Vehicle(model) {
    override var acceleration: Long = 5
}