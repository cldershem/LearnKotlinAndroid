//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
fun main() {
//    notification()
//    movieTicketPrice()
//    convertTemp()
}

fun notification() {
    val morningNotification = 51
    val eveningNotification = 135

    printNotificationSummary(morningNotification)
    printNotificationSummary(eveningNotification)
}

fun printNotificationSummary(numberOfMessages: Int) {
    if (numberOfMessages < 100) {
        println("There are $numberOfMessages notifications.")
    } else {
        println("There are 99+ notificaitons.")
    }
}

fun movieTicketPrice() {
    val child = 5
    val adult = 28
    val senior = 87

    val isMonday = true

    println("The movie ticket price for a person aged $child is \$${ticketPrice(child, isMonday)}.")
    println("The movie ticket price for a person aged $adult is \$${ticketPrice(adult, isMonday)}.")
    println("The movie ticket price for a person aged $senior is \$${ticketPrice(senior, isMonday)}.")
}

fun ticketPrice(age: Int, isMonday: Boolean) : Int {
    return when (age) {
        in 0..12 -> 15
        in 13 .. 60 -> {
            if (isMonday) {
                25
            } else {
                30
            }
        }
        in 61 .. 100 ->  20
        else -> -1
    }
}

fun convertTemp() {
    printFinalTemperature(27.0, "C", "F") {
        (it * 9/5) + 32
    }
    printFinalTemperature(350.0, "K", "C") {
        (it - 273.15 )
    }
    printFinalTemperature(10.0, "F", "K") {
        ((it - 32)) * 5/9 + 273.15
    }
}

fun printFinalTemperature(
    initialMeasurement: Double,
    initialUnit: String,
    finalUnit: String,
    conversionFormula: (Double) -> Double
) {
    val finalMeasurement = String.format("%.2f", conversionFormula(initialMeasurement)) // two decimal places
    println("$initialMeasurement degrees $initialUnit is $finalMeasurement degrees $finalUnit.")
}