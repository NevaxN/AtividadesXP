import classes.Produto

fun main(){
    var produto: Produto = Produto("", 0, 0)
    for(i in 1..5){
        println("Nome produto: ")
        var nome: String = readLine()!!
        produto.nome = nome
        println("Quantidade: ")
        var quant: Int = readLine()!!.toInt()
        produto.quant = quant
        println("nivel Minimo: ")
        var nivelMin: Int = readLine()!!.toInt()
        produto.nivelMin = nivelMin
        when{
            produto.quant <= produto.nivelMin -> produto.reporEstoque()
        }
        println("Nome: ${produto.nome}, Quant: ${produto.quant}, NivelMin: ${produto.nivelMin}")
    }
}