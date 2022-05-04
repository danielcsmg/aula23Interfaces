package exercicios.exercicio1
import kotlin.math.pow

class Quadrado(private val lado: Double): Forma {
    override val forma: String = "quadrado"

    override fun calcularArea(): Double {
        return lado.pow(2)
    }
}