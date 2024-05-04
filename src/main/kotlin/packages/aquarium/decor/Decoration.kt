package packages.aquarium.decor

data class Decoration(val rocks: String, val wood: String, val diver: String) {
}
fun makeDecoration(){
    val decoration = Decoration(rocks = "Granite", wood = "Magohany", diver = "Merry")
    print(decoration)
    val decoration2 = Decoration(wood = "slate", rocks = "Graphite", diver = "Glory")
    println(decoration2)

    val decoration3 = Decoration(diver = "slate", rocks = "Diamond", wood = "Tick")
    println(decoration3)
}