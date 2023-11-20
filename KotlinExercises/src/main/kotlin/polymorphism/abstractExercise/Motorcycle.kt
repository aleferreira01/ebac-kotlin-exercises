package polymorphism.abstractExercise

class Motorcycle(model: String) : Vehicle(model) {
    override var acceleration: Long = 5
}