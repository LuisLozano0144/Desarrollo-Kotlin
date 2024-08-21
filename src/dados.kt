import kotlin.random.Random

fun main() {
    var dado1: Int = 0
    var dado2: Int = 0
    var count1: Int = 0
    var count2: Int = 0

    for (i in 1..5) {
        dado1 = Random.nextInt(1, 6)
        dado2 = Random.nextInt(1, 6)

            println("Lanzamiento #"+i)
            println("Dado #1: $dado1")
            println("Dado #2: $dado2")

            if (dado1 > dado2) {
                println("Dado #1 gana la ronda")
                count1 += 1
                println("Victorias dado 1: $count1")
                println("Victorias dado 2: $count2")
            } else if (dado1 < dado2) {
                println("Dado #2 gana la ronda")
                count2 += 1
                println("Victorias dado 1: $count1")
                println("Victorias dado 2: $count2")
            }else if (dado1 == dado2) {
                println("Uy Empate")
                println("Victorias dado 1: $count1")
                println("Victorias dado 2: $count2")
            }
    }
    if(dado1 > dado2){
        println("El ganador es el dado 1 con: $count1 vicotias")
    }else if (dado1 < dado2) {
        println("El ganador es el dado 2 con: $count2 vicotias")
    }else if (count1 == count2) {
        println("Uy nadie gana; empate ")
    }
}