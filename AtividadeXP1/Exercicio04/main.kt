fun main(){
    var nomes: ArrayList<String> = ArrayList<String>()

    for (i in 1..10){
        println("Informe o nome do $i° Aluno: ")
        nomes.add(readLine()!!)
    }
    nomes.sort()
    println(nomes)
}