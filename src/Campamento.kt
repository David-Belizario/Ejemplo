class Campamento (

    override var seguridad: String = "Media",
    override var superficie: Float = 1200.7f,
    override var aforo: Int = 400,
    override var S_Activos: Int = 359,
    override var funcionalidad: String = "Refugio"

):Cuartel(seguridad, superficie, aforo, S_Activos, funcionalidad, isDirectInstantiation = false) {

    init {
        println("Contruyendo Campamento, seguridad: $seguridad")
    }



}