package exercicios.exercicio1

class Retangulo(private val base: Double, private val altura: Double): Forma {
    override val forma: String = "retângulo"

    override fun calcularArea(): Double {
        return base * altura
    }
}