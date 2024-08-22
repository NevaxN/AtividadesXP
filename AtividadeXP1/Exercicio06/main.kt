fun main(){
    var temps: ArrayList<Int> = ArrayList<Int>()
    var soma: Int = 0
    for(i in 1..30){
        println("Temperatura dia $i: ")
        var temp: Int = readLine()!!.toInt()
        soma+=temp
        temps.add(temp)
    }
    println("A média de temperaturas foi ${soma/temps.size}")
    println("A maior temperatura no mês foi ${temps.max()} no dia ${temps.indexOf(temps.max()) + 1}")
    println("A menor temperatura no mês foi ${temps.min()} no dia ${temps.indexOf(temps.min()) + 1}")
}