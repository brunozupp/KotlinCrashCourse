package classlesson

// When a class is Abstract I don`t need to use open
// before class keyword, just in the attributes from
// the constructor I want to override to permit
// the value being injected during its creation
abstract class Food(
    val isVegatable: Boolean,
    open val weight: Float,
) {

    abstract fun describeFruit()

    fun printInformation() {
        println("IsVegetable: $isVegatable | weight: $weight")
    }
}