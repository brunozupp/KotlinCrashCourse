fun main() {

    val names = listOf<String>("Bruno", "Roberto", "Sandro", "Breno")

    val counter = names.customCount { name ->
        name.startsWith("B")
    }

    println(counter)
}

// Lambdas Functions are functions that are passed as a argument
// to another function
fun List<String>.customCount(function: (String) -> Boolean) : Int {

    var counter = 0

    for(item in this) {
        if(function(item)) {
            counter++
        }
    }

    return counter
}