fun main() {

    println("The number parsed is = ${returnValueDirectlyFromTryCatch()}")
    //println("The number parsed is = ${defaultTryCatch()}")
}

fun returnValueDirectlyFromTryCatch(): Int {

    print("Type a number: ")
    val number = readLine() ?: "0"

    val parsedNumber = try {
        number.toInt()
    } catch(e: Exception) {
        0
    }

    return parsedNumber
}

fun defaultTryCatch() : Int {

    try {
        print("Type a number: ")
        val number = readLine() ?: "0"

        val parsedNumber = try {
            number.toInt()
        } catch(e: Exception) {
            0
        }

        return parsedNumber
    } catch(e: Exception) {
        return 0
    }
}