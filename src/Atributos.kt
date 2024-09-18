abstract class Atributos {

    abstract var nombre: String
    abstract var funcion: String
    abstract var salud: Int
    abstract  var daño: Int

    // "open porque el metodo esta implementado (tiene codigo)"

    open fun descansar(){
        println("$nombre esta descansando y recuperando salud")

    }

}