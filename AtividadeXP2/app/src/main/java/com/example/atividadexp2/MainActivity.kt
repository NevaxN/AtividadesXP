package com.example.atividadexp2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DisplayPreview()
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun PlayerForm() {
    var nome by remember{ mutableStateOf("") }
    var level by remember{ mutableStateOf(1) }
    var poder by remember{ mutableStateOf(0) }
    var equipamento by remember{ mutableStateOf(0) }
    var modificador by remember{ mutableStateOf(0) }
    val jogadores = Player.ListarJogadores()

    Column(modifier= Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally) {

        Text(text = "Nome Jogador")

        Spacer(modifier = Modifier.height(18.dp))

        TextField(value = nome , onValueChange = { nome = it } )

        Spacer(modifier = Modifier.height(18.dp))

        Text(text = "Level: $level")
        Spacer(modifier = Modifier.height(10.dp))

        Row {
            Button(onClick = {
                if(level > 0){
                    level--
                }
            }) {
                Text(text = "-")
            }

            Button(onClick = {
                if(level < 10){
                    level++
                }
            }) {
                Text(text = "+")
            }
        }

        Spacer(modifier = Modifier.height(18.dp))

        Row {
            if(poder in 1..10){
                poder = level + equipamento + modificador
                Text(text = "Poder: $poder")
            }
        }

        Spacer(modifier = Modifier.height(18.dp))

        Text(text = "Equipamento: $equipamento")
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Button(onClick = {
                if(equipamento > 0){
                    equipamento--
                }
            }) {
                Text(text = "-")
            }
            Button(onClick = {
                if(equipamento < 99){
                    equipamento++
                }
            }) {
                Text(text = "+")
            }
        }

        Spacer(modifier = Modifier.height(18.dp))

        Text(text = "Modificador: $modificador")
        Spacer(modifier = Modifier.height(10.dp))
        Row {
            Button(onClick = {
                if(modificador > -10){
                    modificador--
                }
            }) {
                Text(text = "-")
            }
            Button(onClick = {
                if(modificador < 10){
                    modificador++
                }
            }) {
                Text(text = "+")
            }
        }

        Spacer(modifier = Modifier.height(18.dp))

        Button(onClick = {
            Player.AdicionarJogador(Player(nome, level, poder, equipamento, modificador))
            nome = ""
            level = 0
            poder = 0
            equipamento = 0
            modificador = 0
        }) {
            Text(text = "Submit")
        }

        Spacer(modifier = Modifier.height(18.dp))

        LazyColumn{
            items(jogadores){
                    jogador ->
                Column {
                Text(text = "Nome: ${jogador.nome}")
                    Text(text = "Level: ${jogador.level}")
                    Text(text = "Poder: ${jogador.poder}")
                    Text(text = "Equipamento: ${jogador.equipamento}")
                    Text(text = "Modificador: ${jogador.modificador}")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun DisplayPreview() {
    PlayerForm()
}