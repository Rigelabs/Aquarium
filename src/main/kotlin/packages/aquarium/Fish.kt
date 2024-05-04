package packages.aquarium

abstract class Fish {

    abstract val color :String
}
interface FishAction{
    fun eat()
}
class Shark : Fish(), FishAction{
    override val color = "Grey"
    override fun eat(){
        println("Shark Hunt and eat")
    }
}
class Plecostomus : Fish(), FishAction{
    override val color = "Gold"
    override fun eat(){
        println("Plecostomus Eat Algae")
    }
}