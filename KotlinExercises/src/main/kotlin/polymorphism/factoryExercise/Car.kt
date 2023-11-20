package polymorphism.factoryExercise

class Car(model: String) : Vehicle(model) {
    override var acceleration: Long = 10
}