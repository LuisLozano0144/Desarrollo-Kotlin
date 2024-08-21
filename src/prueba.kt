import java.text.DecimalFormat

fun main() {
    var cantmouse = 0
    var cantmteclado = 0
    var cantmonitor = 0
    var cantdiskhard = 0
    var total = 0

    val format = DecimalFormat ("#.000")
    do {
        println("Selecciona un producto")
        println("1- Mouse")
        println("2- Teclado")
        println("3- Monitor")
        println("4- Discos duros")
        println("5- Factura")
        val n = readln().toInt()

        if (n == 1){
            println("ingrese cantidad de mouses")
            val cant = readln().toInt()
            cantmouse += cant
            total += cantmouse * 52
        }else if (n == 2){
            println("ingrese cantidad de Teclados")
            val cant = readln().toInt()
            cantmteclado+= cant
            total += cantmteclado * 84
        }else if (n == 3){
            println("ingrese cantidad de Monitores")
            val cant = readln().toInt()
            cantmonitor += cant
            total += cantmonitor * 79
        }else if (n == 4){
            println("ingrese cantidad de Discos duros")
            val cant = readln().toInt()
            cantdiskhard += cant
            total += cantdiskhard * 24
        }
    } while (n != 5)
    println("Digite su nombre para generar la factura")
        val name = readln()
    println("Digite su nit para añadir a la factura")
    val nit = readln().toInt()
    println("Digite su telefono para añadir a la factura")
    val tel = readln().toInt()

    println("Nombre $name")
    println("nit $nit")
    println("Telefono $tel")


    println("\nProducto\tCantidad\tValor Unitario\tValor Total")

    if (cantmouse > 0) println("Mouse\t\t$cantmouse\t\t${format.format(52).toString()}\t\t${(format.format(cantmouse * 52)).toString()}")
    if (cantmteclado > 0) println("Teclado\t\t$cantmteclado\t\t${format.format(84).toString()}\t\t${(format.format(cantmteclado * 84)).toString()}")
    if (cantmonitor > 0) println("Monitor\t\t$cantmonitor\t\t${format.format(79).toString()}\t\t${(format.format(cantmonitor * 79)).toString()}")
    if (cantdiskhard > 0) println("Disco Duro\t$cantdiskhard\t\t${format.format(24).toString()}\t\t${(format.format(cantdiskhard * 24)).toString()}")

    println("Total a pagar: ${format.format(total)}")
}
