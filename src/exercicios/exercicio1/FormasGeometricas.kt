package exercicios.exercicio1

import kotlin.system.exitProcess

class FormasGeometricas {
    private val formas: ArrayList<Forma> = ArrayList()

    fun calcularEMostrarArea(){
        while (true){
            println("Qual forma deseja calcular?\n" +
                    "Quadrado, Retângulo, Triângulo ou Losango:")
            println("Para mostrar as áreas calculadas, digite 'mostrar':")
            println("Para sair, digite 'sair':")
            val opcao = readln().lowercase()
            when(opcao){
                "mostrar" -> {
                    if(formas.isEmpty()) {
                        println("Sem formas cadastradas!")
                        println()
                    }else {
                        mostrarTodasAsAreas()
                    }
                }
                "quadrado" -> {
                    println("Digite o valor da base do quadrado:")
                    val base = readln().toDouble()
                    formas.add(Quadrado(base))
                    println()
                }
                "retângulo", "retangulo" -> {
                    println("Digite o valor da base do retângulo:")
                    val base = readln().toDouble()
                    println("Digite o valor da altura do retângulo:")
                    val altura = readln().toDouble()
                    formas.add(Retangulo(base, altura))
                    println()
                }
                "triângulo", "triangulo" -> {
                    println("Digite o valor da base do triângulo:")
                    val base = readln().toDouble()
                    println("Digite o valor da altura do triângulo:")
                    val altura = readln().toDouble()
                    formas.add(Triangulo(base, altura))
                    println()
                }
                "losango" -> {
                    println("Digite o valor da base do losango:")
                    val base = readln().toDouble()
                    println("Digite o valor da altura do losango:")
                    val altura = readln().toDouble()
                    formas.add(Losango(base, altura))
                    println()
                }
                "sair" -> exitProcess(0)
                else -> {
                    println("Opção inválida.\n" +
                            " Digite novamente:")
                    println()
                }
            }
        }
    }

    private fun mostrarTodasAsAreas(){
        println("Área das formas:")
        formas.forEach{
            it.mostrarInformacoes()
            println("----------------------------")
            println()
        }
        println()
    }
}