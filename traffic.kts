fun traffic() {
    val trafficLightColor = "Amber"

    when (trafficLightColor) {
        "Red" -> println("Stop")
        "Yellow", "Amber" -> println("Slow")
        "Green" -> println("Go")
        else -> println("Invalid traffic-light color")
    }
}

// traffic()

fun numbers() {
    val x: Any = 88

    when (x) {
        2, 3, 5, 7 -> println("x is a prime number between 1 and 10.")
        in 1..10 -> println("x is a number between 1 and 10, but not a prime number.")
        is Int -> println("x is an integer number, but not between 1 and 10.")
        else -> println("x isn't an integer number.")
    }
}

// numbers()

fun ifExpression() {
    val trafficLightColor = "Black"

    val value =
        if (trafficLightColor == "Red") {
            "Stop"
        } else if (trafficLightColor == "Yellow") {
            "Slow"
        } else if (trafficLightColor == "Green") {
            "Go"
        } else {
            "Invalid traffic-light color"
        }

    println(value)
}

// ifExpression()

fun whenExpression() {
    val trafficLightColor = "Amber"

    val message =
        when (trafficLightColor) {
            "Red" -> "Stop"
            "Yellow", "Amber" -> "Slow"
            "Green" -> "Go"
            else -> "Invalid traffic-light color"
        }

    println(message)
}

// whenExpression()

fun actors() {
    var favoriteActor: String? = "Sandra Oh"

    favoriteActor = null
    println(favoriteActor!!.length)
}

// actors()

fun optional() {
    var number: Int? = 10

    println(number)

    number = null
    println(number)
}

// optional()

fun ifNull() {
    var favoriteActor: String? = "Sandra Oh"
    // favoriteActor = null

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}

ifNull()
