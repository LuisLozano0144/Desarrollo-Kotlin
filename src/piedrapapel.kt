import kotlin.random.Random

fun main() {
    var player1: Int = 0
    var player2: Int = 0
    var count1: Int = 0
    var count2: Int = 0
    var ganador  = false

    do {
        player1 = Random.nextInt(1, 3)
        player2 = Random.nextInt(1, 3)

        if (player2 == player1) {
            when (player1) {
                1 -> println("Empate porque ambos sacaron piedra")
                2 -> println("Empate porque ambos sacaron papel")
                3 -> println("Empate porque ambos sacaron tijera")
            }
        }
        if (player2 == 1 && player1 == 2) {
            println("Player #2 pierde pq saco: Piedra")
            println("Player #1 gana pq saco: Papel")
            count1 += 1
        }
        if (player2 == 2 && player1 == 3) {
            println("Player #1 gana pq saco: Tijera")
            println("Player #2 pierde pq saco: Papel")
            count1 += 1
        }
        if (player2 == 3 && player1 == 1) {
            println("Player #1 gana pq saco: Piedra")
            println("Player #2 pierde pq saco: Tijera")
            count1 += 1
        }
        //
        if (player1 == 1 && player2 == 2) {
            println("Player #1 pierde pq saco: Piedra")
            println("Player #2 gana pq saco: Papel")
            count2 += 1
        }
        if (player1 == 2 && player2 == 3) {
            println("Player #1 pierde pq saco: papel")
            println("Player #2 gana pq saco: tijera")
            count2 += 1
        }
        if (player1 == 3 && player2 == 1) {
            println("Player #2 gana pq saco: piedra")
            println("Player #1 pierde pq saco: tijera")
            count2 += 1
        }
        println("------------------------------------------")
        println("contador1 $count1")
        println("contador2 $count2")
    if (count1 == 2 || count2 == 2)
        ganador = true
    }while(!ganador)

    println("partidas ganadas player#1: $count1")
    println("partidas ganadas player#2: $count2")
}

