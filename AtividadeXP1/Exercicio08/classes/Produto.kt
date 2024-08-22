package classes

class Produto(var nome: String, var quant: Int, var nivelMin: Int){
    
    fun reporEstoque(): Int{
        quant = 20
        return quant
    }
}