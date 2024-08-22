fun main(){
    println("Informe quantas vezes quer jogar os dados: ")
    var limite: Int = readLine()!!.toInt()

    for(i in 1..limite){

        var dado1: Int = (1..6).random()

        var dado2: Int = (1..6).random()

        println("A soma dos dados foi ${dado1 + dado2}")
    }
}