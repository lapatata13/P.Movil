package clases

open class Enemy(val name: String, val strength: Int) {
    protected var direction = "LEFT"
    protected  fun changeDirection(){
        direction = if(direction == "RIGHT") "LEFT" else "RIGHT"
        println("$name va en direccion $direction")
    }

    protected fun die(){
        println("$name ha muerto")
    }

    open fun colision(collider:String){
        when(collider){
            "Weapon" -> die()
            "Enemy" -> changeDirection()
        }
    }
}