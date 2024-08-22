package classes
data class Voo(var numeroVoo: Int, var assentosDisponiveis: List<Int> = listOf(1, 5, 18, 20), var reservarAssento: Int? = null)