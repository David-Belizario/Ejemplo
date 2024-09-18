class EquipoMortero (
    override var nombre: String = "Descconocidos",
    override var funcion: String = "Artillero",
    override var salud: Int = 350,
    override var daño: Int = 50
): Atributos(), Acciones {

    init {
        println("Datos del Equipo mortero")
    }

    override fun atacar() { // Interfaz Acciones
        var lanzarProyectil = " han fectuando fuego."
        println("$nombre $lanzarProyectil")
    }

    override fun defender() { // Interfaz Acciones
        var escapar = " estan corriendo."
        println("$nombre $escapar")
    }

    override fun descansar() {
        super.descansar()
    }

    fun mostrarDatos (){

        println("Nombre: $nombre")
        println("Funcion: $funcion")
        println("Salud: $salud")
        println("Daño: $daño")

    }

}