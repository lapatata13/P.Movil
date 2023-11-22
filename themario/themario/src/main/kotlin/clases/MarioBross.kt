package clases
import  java.util.*
import kotlin.concurrent.schedule
class MarioBross(var vidas: Int = 3) {

    val isAlive: Boolean
        get() {
            return lives >= 1
        }

    init {
        println("it's me! Mario")
    }

    private var state =  "small"
        set(value) {
            val before = field
            field = value
            println("Tu estado ahora es $field")
            if(value == "star"){
                Timer("SettingUp",false).schedule(10000){
                    field = before
                    println("Mario tiene un estado $field")
                }
            }
        }


    private var lives = 3
        set(value) {
            if(field < 1){
                field = 0
                gameOver()
            }else{
                field = value
            }
        }
    /*private fun die(){
        lives--
        println("Ha perdido una vida")
    }*/

    public fun colision(colisionObj : String){
        when(colisionObj){
            "Goomba" -> lives--
            "Super Mushroom" -> state = "Super Mario"
            "Fire floor" -> state = "Fire Mario"
            else -> println("Objeto desconocido!")
        }
    }

    fun getLives():String{
        return "$lives vidas"
    }

    private fun gameOver(){
        println("GAME OVER")
    }

}