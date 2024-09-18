open class Cuartel (

    open var seguridad : String = "Media", open var superficie : Float = 2500.8f,
    open var aforo: Int = 250, open var S_Activos: Int = 150, open var funcionalidad: String = "Vigilancia") { //Constructor

    init {
        println("Construyendo cuartel, seguridad: $seguridad")
    }

    constructor(numeroEfectivos: Int) : this() { //cosntructor secundario segun el numero de efectivos

        val tamaño = numeroEfectivos

        superficie = (numeroEfectivos * 10).toFloat()

    }

    open var numeroDormitorios: Int
        get() = ((superficie / aforo)).toInt()
        set(valor){
            numeroDormitorios = valor
        }

    fun imprimirDatos(){

        println("Superficie:         $superficie")
        println("Aforo:              $aforo")
        println("Personal Activo:    $S_Activos")
        println("Numero Dormitorios: $numeroDormitorios")
        println("Funcionalidad:      $funcionalidad")

    }

}