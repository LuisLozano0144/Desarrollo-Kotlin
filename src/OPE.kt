class operacion (var n1 : Double, var n2: Double){
    fun suma(){
        var result = n1 + n2
        println("suma: $result")
    }
    fun div() {
        println("division : ${n1 / n2}")
    }
    fun raiz ( x: Double){
        var r = Math.sqrt(x)
        println("Raiz ${r}")
    }
    fun cuadrado( c: Double){
        println("Cuadrado : ${Math.pow(c, 2.0)}")
    }
}