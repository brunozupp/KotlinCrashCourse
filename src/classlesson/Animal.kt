package classlesson

// To permit that this class be inherited I need to put the word
// open before class. And to permit that I set the sane attribute
// in the constructor to pass to the Father class (Animal), I need
// to put open in the arguments from the constructor too.
open class Animal(
    open val name: String,
) {

    init {
        println("The animal name is $name")
    }
}