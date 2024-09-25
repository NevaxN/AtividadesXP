package com.example.atividadexp2

class Player(var nome: String,
                  var level: Int,
                  var poder: Int,
                  var equipamento: Int,
                  var modificador: Int){
    companion object{
        var listaDeJogadores = listOf<Player>()

        fun AdicionarJogador(jogador:Player){
            if(listaDeJogadores.size <= 6){
                listaDeJogadores = listaDeJogadores + jogador
            }
        }

        fun ListarJogadores(): List<Player>{
            return listaDeJogadores
        }
    }
}