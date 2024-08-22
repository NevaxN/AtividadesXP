fun main(args: Array<String>) {
    println("Informe um número: ")
    var num: Int = readLine()!!.toInt()
    var divisoes0:Int = 0

    for(i in 1..num-1){
        when{
            i > 1 && num % i == 0 -> divisoes0++
            divisoes0 == 1 -> break 
        }
    }

    when{
        divisoes0 == 0 -> println("É primo!")
        divisoes0 > 0 -> println("Não é primo!")
    }
}