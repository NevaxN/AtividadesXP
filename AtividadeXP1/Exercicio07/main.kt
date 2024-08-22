import classes.Voo
fun main(){
    var voo: Voo = Voo(123)
    var reservarAssento: Int
    while(true){
        println("Informe o numero do Assento: ")
        reservarAssento = readLine()!!.toInt()

        if(reservarAssento in voo.assentosDisponiveis){
            println("Assento ${reservarAssento} Reservado!")
            break
        }
        println("Assento já ocupado!")
    }
    voo.reservarAssento = reservarAssento
    println(voo.toString())
}