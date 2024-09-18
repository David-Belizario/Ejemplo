class Caballero(
    nombreInicial: String,
    funcionInicial: String,
    saludInicial: Int
) : Personaje() {

    override var nombre: String = nombreInicial
        get() = field
        set(value) {
            field = value
        }

    override var funcion: String = funcionInicial
        get() = field
        set(value) {
            field = value
        }

    override var salud: Int = saludInicial
        get() = field
        set(value) {
            field = value
        }

    override fun atacar(): String {
        return "$nombre ataca con su espada"
    }
}
