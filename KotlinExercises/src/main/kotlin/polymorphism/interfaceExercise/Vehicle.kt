package polymorphism.interfaceExercise

interface Vehicle {

    val model: String
    var velocity: Long
    val acceleration: Long

    fun increaseVelocity() {
        this.velocity += this.acceleration
    }

    fun decreaseVelocity() {
        this.velocity -= this.acceleration

        if (this.velocity < 0) this.velocity = 0
    }

    fun currentVelocity() {
        println("Veiculo=${this.javaClass.simpleName}, Modelo=$model, Velocidade atual=$velocity")
    }

}