package exercicios.exercicio1

class Losango(private val base: Double, private val altura: Double): Forma {
    override val forma: String = "losango"

    override fun calcularArea(): Double {
        return base * altura
    }
}