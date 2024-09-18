fun main() {
    // caballero
    val caballero = Caballero(nombre = "Anduin",)

    caballero.atacar()
    caballero.defender()
    caballero.descansar()
    caballero.mostrarDatos()

    println()

    // campamento
    val campamento = Campamento()

    campamento.imprimirDatos()

    println()

    val cuartel = Cuartel()

    cuartel.imprimirDatos()

    println()

    val cuartel2 = Cuartel(numeroEfectivos = 50)

    cuartel2.imprimirDatos()

    println()

    // campamento
    val campamento2 = Campamento()
    campamento2.seguridad = "Media"
    campamento2.imprimirDatos()

    println()

    val equipoMortero = EquipoMortero(nombre = "Los Enanos")

    equipoMortero.mostrarDatos()
    equipoMortero.atacar()
    equipoMortero.defender()
    equipoMortero.descansar()

}
