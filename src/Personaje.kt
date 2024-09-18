abstract class Personaje {

    abstract var nombre: String
    abstract var funcion: String
    abstract var salud: Int

    abstract fun atacar(): String

    open fun descansar(){
        println("$nombre esta descansando y recuperando salud")

        salud += 5

    }

}