package clases

open class national(override val city: String): travel() {
        override val country = "mexico"
    protected val fees = mapOf(
        "Monterrey" to 400,
        "Guadalajara" to 350,
        "CDMX" to 360,
        "San cristobal de las casas" to 240,
        "San miguel de allende" to 320
    )
    override fun getPrice(numDays: Int): Int{
        val fee = fees[city]
        return if (fee==null) 0 else fee*numDays
    }

    override fun quotePrice(numDays: Int){
        val price = getPrice(numDays)
        if(price==0){
            println("los sentimos no travels pa alla")
        }
        else {
            println("el viaje a $city cuesta \$$price")
        }
    }
}