import clases.*

fun main() {

    /*var myPhone = Phone()
    myPhone.turnOn()
    myPhone.getTurn()*/

    /*val miVehiculo = Cars("011-504",40.5F,false)
    miVehiculo.color = "Rojo"
    miVehiculo.marca = "Toyota"
    miVehiculo.modelo = "A11"
    miVehiculo.recragar(35.4F)
    miVehiculo.enceder()

    val marioBross = MarioBross()
    for (i in 1..5){
        if(marioBross.isAlive){
            marioBross.colision("Super Mushroom")
            println("Te quedan ${marioBross.getLives()}")
        }
    }

    val enemy = Goomba()
    val enemy1 = Koopa()

    enemy1.colision("Weapon")
val viajeMonterrey = national("monterey")
    viajeMonterrey.quotePrice(4)
    viajeMonterrey.reserve(4)
val viajeMonterreyconDescuento*/

    val scarymovie = movie("scarymovie", "comedia", 88.27)
    println(scarymovie)
    /*println(scarymovie.name)*/
    scarymovie.createdAt = "2000"
    println(scarymovie.component1())
    val (name2, gender2, duration2) = scarymovie
    println ("nuevas variables $name2 $gender2 $duration2")

    val scarymovie2 = scarymovie.copy(name ="scarymovie2",  duration =88.27)
    println("scarimovie : $scarymovie  scary movie 2: $scarymovie2".trimIndent())

    val veiculoinstance = veiculo.create()
    /*val saludo = { println("hola") }()*/
    val suma = {a: Int, b: Int -> a + b}
    println(suma(4, 5))

    val savergrade: (Double, Double) -> String = {expected: Double, saved: Double ->
        val percentaje = saved / expected
        when {
            percentaje > 1 -> "pro"
            percentaje == 1.0 -> "buen"
            percentaje < 1.0 && percentaje >= 0.8 -> "almost"
            else -> "aprendiz"
        }
    }
    println(savergrade(100.0, 120.0))

    val savergrade2= fun(expected: Double, saved: Double): String{
        val percentaje = saved / expected
        return when {
            percentaje > 1 -> "pro"
            percentaje == 1.0 -> "buen"
            percentaje < 1.0 && percentaje >= 0.8 -> "almost"
            else -> "aprendiz"
        }
    }
    println(savergrade2(100.0, 120.0))
    fun sumaordensuperior(a: Int, b: Int, suma: (Int, Int) -> Int): Int{
        return suma(a,b)
    }
}