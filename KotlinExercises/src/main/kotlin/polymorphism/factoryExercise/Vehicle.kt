package polymorphism.factoryExercise

abstract class Vehicle(val model: String) {

    private var velocity: Long = 0
    abstract val acceleration: Long

    fun increaseVelocity() {
        this.velocity += this.acceleration
    }

    fun decreaseVelocity() {
        this.velocity -= this.acceleration

        if (this.velocity < 0) this.velocity = 0
    }

    fun currentVelocity() {
        println("Veiculo=${this.javaClass.simpleName}, model=$model, Velocidade atual=$velocity")
    }

}