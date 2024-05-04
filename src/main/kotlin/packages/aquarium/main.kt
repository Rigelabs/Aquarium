package packages.aquarium

fun buildAquarium(){
    val my_aquarium = Aquarium()
    my_aquarium.printSize()
    val my_tower = TowerTank(height = 40, diameter =60)
    my_tower.printSize()
}
fun makeFish(){
    val shark = Shark()
    val plesco = Plecostomus()
    println("Shark: ${shark.color}")
    shark.eat()
    println("Plecostomus: ${plesco.color}")
    plesco.eat()
}
fun main(){
    buildAquarium()
    makeFish()
}