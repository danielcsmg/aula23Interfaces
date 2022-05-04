package exercicios.exercicio1

class Triangulo(private val base: Double, private val altura: Double): Forma {
    override val forma: String = "triângulo"

    override fun calcularArea(): Double {
        return base * altura / 2
    }
}