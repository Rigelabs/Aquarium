package packages.aquarium.decor

data class Decoration(val rocks: String, val wood: String, val diver: String) {
}
fun makeDecoration(){
    val decoration = Decoration(rocks = "Granite")
    print(decoration)
    val decoration2 = Decoration(wood = "slate")
    println(decoration2)

    val decoration3 = Decoration(diver = "slate")
    println(decoration3)
}