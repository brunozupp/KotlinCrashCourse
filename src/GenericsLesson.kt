fun main() {

    val numbers = listOf<Int>(1,2,3,4,5,6,7,8,9,10,11,12)

    val counter = numbers.customCount { number ->
        number % 2 == 0
    }

    println(counter)
}

fun <T> List<T>.customCount(function: (T) -> Boolean) : Int {

    var counter = 0

    for(item in this) {
        if(function(item)) {
            counter++
        }
    }

    return counter
}