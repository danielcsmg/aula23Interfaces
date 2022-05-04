package exercicios.exercicio1

interface Forma {
    val forma: String

    fun calcularArea(): Double

    fun mostrarInformacoes(){
            println("A área do $forma é de ${calcularArea()}")
    }
}