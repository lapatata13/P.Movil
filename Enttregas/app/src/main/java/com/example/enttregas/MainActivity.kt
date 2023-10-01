/*fun main() {
    println("HELLO UPIICSA")
    println("Lopez Valdez Abraham")
    println("Progamacion Movil")
    println("6NV60")
}*/

/*const val num3 = 24f
const val pi = 3.1416
fun main(){
    val num1 = 10
    var num2 = 34
    num2 = 20
    println("numero 1: $num1")
    println("numero 2: $num2")
    println("numero 3: $num3")
    println("tipo de dato asignado por defecto: ${num1::class.simpleName}")
    println("")
    val dec = 15
    var per = pi*(dec*2)
    println("el perimetro cuando el radio es $dec vale: $per")
}*/


fun main(){
    print("Introduce el valor de x1 (solo numeros):")
    val x1: Int = readln().toInt()
    print("Introduce el valor de y1 (solo numeros):")
    val y1: Int = readln().toInt()
    print("Introduce el valor de x2 (solo numeros):")
    val x2: Int = readln().toInt()
    print("Introduce el valor de y2 (solo numeros):")
    val y2: Int = readln().toInt()
    val num = y2.minus(y1)
    val dem = x2.minus(x1)
    val d1 = num/dem
    val d2 = num.toFloat()/dem.toFloat()
    println("valor de la pendiente erronea: $d1")
    println("valor de la pendiente con correccion: $d2")
}
