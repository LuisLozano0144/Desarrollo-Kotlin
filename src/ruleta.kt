import kotlin.random.Random

fun main() {
    val bala:Int = Random.nextInt(1,6)
    val bala2:Int = Random.nextInt(1,6)
    var end:Int = 0

    for(n in 1 .. 6 ){
        if(n == bala || bala2 ==n){
            println("se murio el jugador $n")
            end += 1

            println("desea seguir disparando(s/n)??")
            val option = readln()
            if(option == "n"){
                break
            }
        }else(println("se salvo el jugador $n"))
            if (end == 2){
                break
            }
    }

}