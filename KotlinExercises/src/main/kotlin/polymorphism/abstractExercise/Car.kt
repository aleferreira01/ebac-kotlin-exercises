package polymorphism.abstractExercise

class Car(model: String) : Vehicle(model) {
    override var acceleration: Long = 10
}