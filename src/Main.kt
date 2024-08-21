fun main() {
    val op = operacion(6.0, 7.2)

    val listaOperacion = mutableListOf(
        {op.suma()},
        {op.div()},
        {op.raiz(2.0)},
        {op.cuadrado(4.0)}
    )
    for (element in listaOperacion){
        element()
    }
}