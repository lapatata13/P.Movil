package com.example.myapplication
import kotlin.math.pow

const val PI=3.1416f
const val PHI=1.1618f
fun circleArea(radius:Float):Float{
    return PI*radius.pow(2)
}
fun printPhi(){
    println("El numero aureo vale $PHI")
}
fun getPI():Float{
    return PI
}

//funciones locales
fun login(user: String,password: String) : Boolean{
    fun validate(input: String): Boolean {
        if(input.isEmpty()){
            return false
        }
        return true
    }
    val userValidated = validate(user)
    val passValidated = validate(password)

    return userValidated && passValidated
}
fun rectangleArea (base:Double =20.0, height:Double= 30.0): Double{
    return base*height
}
fun prismaVolumen (area:Double, fondo:Double){
    val volumen=area*fondo
    println("EL volumen del prisma es $volumen")

}
fun imprimir(
    valor: String ="Este es el primer valor por defecto",
    valor2: String = "Este es el segundo valor por defecto"){
    println(valor)
    println(valor2)
}

fun promedio(
    valor: Float =10.0f,
    valor2: Float = 8.0f,
    valor3:Float):Float{
    return ((valor+valor2+valor3)/3f)
}
/*fun verifyAge(){
    print("ingresa edad y presiona enter(escibe solo el numero)")
    val age = readLine()?.toInt()
    if (age!! >18){
        println("ya eres mayor de edad!")
    }
    else if (age!! ==18){
        println("acabas de cumplir la mayoria de edad")
    }
    else
    {
        println("aun estas chato apa")
    }
}*/
/*fun gradoEscolar(){
    print("Ingresa edad y presiona enter (escibe solo el nuemro)")
    val age = readLine()?.toInt()
    when(age){
        0 -> println("apenas eres recien nacido")
        1 -> println("solo tienes un año de edad")
        in 2..5->println("estas en preescolar")
        in 6..11->println("estas en la primaria")
        in 12..14->println("estas en secundaria")
        in 15..17->println("estas en bachillerato ")
        in 18..25->println("estas estas en la universidad")
        else -> {
        println("Edad invalida")
        println("vuelve a correr el codigo")
    }
    }

}*/
/*fun tipotringulo(){
    print("Ingresa la primer medida del lado 1")
    val lad1 = readLine()?.toInt()
    print("Ingresa la segunda medida del lado 2)")
    val lad2 = readLine()?.toInt()
    print("Ingresa la tercer medida del lado 3")
    val lad3 = readLine()?.toInt()
    if (lad1==lad2){
        if (lad2==lad3){
            println("el tirangulo que tienes es equilatero")
        }
        else println("el tirangulo que tienes es isoceles")
    }
    else if (lad1==lad2){
        if (lad2 !=lad3){
            println("el tirangulo que tienes es isoceles")
        }
        else println("el tirangulo que tienes es escaleno")
    }

    else if (lad1!=lad2){
        if (lad2 !=lad3){
            println("el tirangulo que tienes es escaleno")
        }
    }
}*/
/*val nombres = listOf(
    "kirby",
    "Ness",
    "Fox",
    "Luigi",
    "Mario",
    "Link",
    "Yoshi"
)*/

fun main(){
    var contador=0
    val radius=4f
    val area = circleArea(radius)
    println("El area del circulo es: $area")
    println("EL valor de pi es "+ getPI())
    printPhi()
    val userValidated = login("juanito","Navaja")//utilizar la funcion login y guardar el resultado en una variable
    println("Usuario loggeado? $userValidated")//imprimir si el usuario estan ingicando
    println("Area con los valores por defecto es igual a: ${rectangleArea()}")
    prismaVolumen(rectangleArea(),4.4)
    imprimir("remplazo del primer valor")
    imprimir("Remplazo del pirmer valor,","Remplazo del segundo valor")
    println(promedio(valor3 = 8.0f))
    //clase del dia 21
   //verifyAge()
    //gradoEscolar()
    //tipotringulo()
   val nombres = listOf(
        "kirby",
        "Ness",
        "Fox",
        "Luigi",
        "Mario",
        "Link",
        "Yoshi",
        "Fox",
        "Fox",
        "Juan"
    )

    /*for (nombre in nombres){
        println(nombre)
        if (nombre=="Fox"){
            contador++
            println("el nombre se repite"+contador+"veces")

        }
    }
    nombres.forEach{println(it)}

   var x = 20
    while (x > 0){
        println(x)
        x --
    }*/
    println("numeros de elementos: ${nombres.size}")
    println("segundo elemento: ${nombres.get(1)}")
    println("cuarto elemento: ${nombres[3]}")
    println("Ultimo elemntos: ${nombres.get(nombres.size - 1)}")
    println("index del elemnto \"Mario\": ${nombres.indexOf("Mario")}")

    val num = mutableListOf(1, 2, 3, 4)
    //agrega elemento
    num.add(5)
    //remover elemtos
    num.removeAt(1)
    //modificar elemtos
    num[0]= 0
    println(num)

    val numSet: Set<Int> = setOf(0,1,2,3,4,5)
    val reverseNumSet: Set<Int> = setOf(5,4,3,2,1,0)
    //se crea un mutable
    val names: Set<String> = mutableSetOf("Nombre 1", "Nombre 2")
    println(numSet)

    val namesToAges: Map<String, Int> = mapOf("user_one" to 20, "user_two" to 23)
    for ((Key, value)in namesToAges){
        println("$Key tiene $value años")
    }



}