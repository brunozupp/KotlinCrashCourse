package classlesson

class Dog(
    override val name: String,
    val isBig: Boolean
) : Animal(name = name) {
}