//Escreva um programa que leia um parágrafo de texto e conte o número de
//palavras nele. Exiba a contagem total de palavras. 22

fun main(){
    var texto: String = "Escreva um programa que leia um parágrafo de texto e conte o número de palavras nele. Exiba a contagem total de palavras."
    var palavras = ArrayList<String>()
    var palavra = ""

    for(i in 0..texto.length-1){
        palavra += texto[i]
        if(texto[i] == ' ' || i == texto.length-1){
            palavras.add(palavra)
            if (palavra == " "){
                palavras.remove(palavra)
            }
            palavra = ""
        }
    }

    println("O texto tem: ${palavras.size} palavras")

}