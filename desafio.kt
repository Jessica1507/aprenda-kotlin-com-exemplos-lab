// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel {INICIANTE, INTERMEDIARIO, AVANCADO}
fun main() {
      for (nivel in Nivel.values()) println(nivel.toString())
      println("O segundo nivel e:${Nivel.valueOf("Intermediario")}")
  }

class Usuario (val nome: String, var age: Int)
fun main() {
    val usuario = Usuario ("Joao", 18)
}


data class ConteudoEducacional(val nome: String, val duracao: Int = 60)
 fun main() {

     val conteudoEducacional = ConteudoEducacional("Principais conceitos em  Kotlin", 60)
     val conteudoEducacional01 = ConteudoEducacional(" Desenvolvimento Android", 60)
     val conteudoEducacional02 = ConteudoEducacional("Desafios de codigo",60 )

     println(conteudoEducacional)
     println(conteudoEducacional01.copy("Desenvolvimento Android"))

 }

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

fun main() {
    val inscritos = mutableListOf<String>("Joao", "Ana","Andre")
        inscritos.add("Carlos")
    println(inscritos)

    inscritos.remove("Carlos")
    println(inscritos)
}
    
    fun matricular(usuario: Usuario) {
        TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
    }
}

fun main() {
    TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
}
