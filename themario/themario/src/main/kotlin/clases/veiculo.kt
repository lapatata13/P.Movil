package clases

class veiculo {
    init{
        println("veiculo created")
    }
    companion object Factory{
        fun create(): veiculo = veiculo()
    }
}