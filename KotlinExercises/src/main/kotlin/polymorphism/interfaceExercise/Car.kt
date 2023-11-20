package polymorphism.interfaceExercise

class Car(override val model: String) : Vehicle {
    override var velocity: Long = 0
    override var acceleration: Long = 10
}