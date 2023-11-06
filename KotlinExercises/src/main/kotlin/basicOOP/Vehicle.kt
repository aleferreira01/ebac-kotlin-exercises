package basicOOP

class Vehicle(model: String) {
    private var velocity: Long
    private var acceleration: Long
    var model: String = ""

    init {
        this.model = model
        this.acceleration = 10
        this.velocity = 0
    }
    fun increaseVelocity() {
        this.velocity += this.acceleration
    }

    fun decreaseVelocity() {
        this.velocity -= this.acceleration

        if (this.velocity < 0) this.velocity = 0
    }

    fun currentVelocity() {
        println("Modelo do carro: ${this.model}")
        println("Velocidade atual: ${this.velocity} \n")
    }

}