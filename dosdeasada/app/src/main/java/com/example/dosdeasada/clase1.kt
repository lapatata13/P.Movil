import kotlin.math.floor
import kotlin.math.log
import kotlin.math.roundToInt

fun main() {
    val userValid = login(" "," ")
    println(userValid)

    val valRectagle = rectangleArea(85.0,20.0,50.0)
    println(valRectagle)
    imprimir2()

    val promedio = calificaciones(cal1 = 7f, cal2 = 8f, cali3 = 7f)
    println("El promedio de calificaciones es ${promedio}")

}

//funcuion local
fun login(user:String, password:String):Boolean{
    fun validate(input:String):Boolean{
        if(input.trim().isEmpty()){
            return false
        }
        return true
    }

    val userValidated = validate(user)
    val passValidated = validate(password)

    return userValidated && passValidated
}

fun rectangleArea(base:Double,height: Double,ancho:Double):Double{
    return base*height*ancho
}


fun imprimir2(valor:String = "Este es el primer valor por defectos",
              valor2:String = "Este es el segundo valor por defecto"){
    println(valor)
    println(valor2)
}

fun calificaciones(cal1:Float = 8f,cal2:Float= 8f, cali3:Float): Float {
    val promedio: Float = (cal1 + cal2 + cali3)/3f
    return promedio.roundToInt().toFloat()
}