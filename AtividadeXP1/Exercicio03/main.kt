import classes.Aluno

fun main(){
    for(i in 1..5){
        var notas: ArrayList<Float> = ArrayList<Float>()
        println("Digite o nome do Aluno: ")
        var nome: String = readLine()!!

        for(j in 1..3){
            println("Digite a $j° nota: ")
            notas.add(readLine()!!.toFloat())
        }
        var aluno: Aluno = Aluno(nome, notas)
        var soma: Float = 0.0f

        for (nota in 0..aluno.notas.size-1){
            soma+=aluno.notas[nota]
        }
        
        when{
            soma/aluno.notas.size >= 7 -> println("O aluno ${aluno.nome} teve a média ${soma/aluno.notas.size}, está Aprovado!")

            soma/aluno.notas.size < 7 -> println("O aluno ${aluno.nome} teve a média ${soma/aluno.notas.size}, está Reprovado!")
        }
    }
}