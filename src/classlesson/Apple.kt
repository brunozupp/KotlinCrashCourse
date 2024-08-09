package classlesson

class Apple(
    override val weight: Float,
): Food(
    isVegatable = false,
    weight = weight

) {

    override fun describeFruit() {
        println("Described Fruit: Apple")
    }
}