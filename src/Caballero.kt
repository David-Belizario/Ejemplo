class Caballero(

    override var nombre: String = "Desconocido",
    override var funcion: String = "Sir",
    override var salud: Int = 900,
    override var daño: Int = 27

) : Atributos(), Acciones {

    init {
        println("----Acciones----")
    }

    override fun atacar() { // heredado de "Acciones"

        var estocada = "ha lanzado una estocada."
        println("$funcion $nombre $estocada")
    }

    override fun defender() { // heredado de "Acciones"

        var escudo = "ha levantado el escudo."
        println("$funcion $nombre $escudo")
    }

    override fun descansar() {
        super.descansar()
    }

    fun mostrarDatos (){

        println("Datos del Caballero")
        println("Nombre: $nombre")
        println("Funcion: $funcion")
        println("Salud: $salud")
        println("Daño: $daño")

    }

}
