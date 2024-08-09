fun main() {

    val n = 4

    println("Number 4 is odd? = ${n.isOdd()}")
}

fun printWithoutArgument() {
    println("Hello World, Bruno")
}

fun printName(name: String) {
    println("The name is $name")
}

fun printNameWithDefaultValueInArgument(name: String = "Bruno") {
    println("The name is $name")
}

/// Return a value from a function
fun isEven(number: Int) : Boolean {
    return number % 2 ==  0
}

/// Do Extension Method
fun Int.isOdd() : Boolean {
    return this % 2 == 1
}

fun usingWhen(number: Int): String {

    val phrase = when(number) {
        1 -> "Number is 1"
        2, 3, 4 -> "Number is between 3 numbers: 2, 3 and 4"
        in 5..10 -> "Number is in a range from 5 until 10"
        else -> "The number doesn`t suit any condition"
    }

    return phrase
}