package clases

class Koopa:Enemy("Koopa",5) {
    init {
        println("iniciando superclases de $name")
    }

    private var state =  "Normal"
    override fun colision(collider:String){
        when(collider){
            "Weapon" -> {
                state = "Shell"
                println("El estado es ahora $state")
            }
            "Enemy" -> changeDirection()
        }
    }
}