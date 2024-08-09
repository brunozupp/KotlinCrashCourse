package classlesson

fun main() {

    /// This object : creates a temporary class
    /// that we call Anonymous Class
    val banana = object : Food(isVegatable = false, weight = 3f) {

        override fun describeFruit() {
            println("Anonymous Class created - Banana")
        }
    }

    banana.describeFruit()
    banana.printInformation()
}