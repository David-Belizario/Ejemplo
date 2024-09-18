open class Cuartel (

    open var seguridad : String = "Alta",
    open var superficie : Float = 2500.8f,
    open var aforo: Int = 400,
    open var S_Activos: Int = 150,
    open var funcionalidad: String = "Vigilancia",
    private val isDirectInstantiation: Boolean = true

) { //Constructor

    init {
        if (isDirectInstantiation) {
            println("Construyendo Cuartel de seguridad $seguridad")
        }
    }

    constructor(numeroEfectivos: Int) : this() { //cosntructor secundario segun el numero de efectivos

        superficie = (numeroEfectivos * 10).toFloat()

    }

    open var numeroDormitorios: Int
        get() = ((S_Activos + 50)).toInt()
        set(valor) {
        }

    fun imprimirDatos(){

        println("Superficie:         $superficie")
        println("Aforo:              $aforo")
        println("Personal Activo:    $S_Activos")
        println("Numero Dormitorios: $numeroDormitorios")
        println("Funcionalidad:      $funcionalidad")

    }

}