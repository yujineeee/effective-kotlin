import java.awt.Color
import kotlin.random.Random

//나쁜 예
fun updateWeather(degrees: Int) {
    val description: String
    val color: Color
    if (degrees < 5) {
        description = "cold"
        color = Color.BLUE
    } else if (degrees < 23) {
        description = "mild"
        color = Color.YELLOW
    } else {
        description = "hot"
        color = Color.RED
    }

    println("나쁜 예: description {$description}, color {$color}")
}

//조금 더 좋은 예
fun betterUpdateWeather(degrees: Int) {
    val (description, color) = when {
        degrees < 5 -> "cold" to Color.BLUE
        degrees < 23 -> "mild" to Color.YELLOW
        else -> "hot" to Color.RED
    }

    println("조금 더 좋은 예: description $description, color $color")
}


fun main() {
    val degrees = Random.nextInt(1, 101)
    println("degrees : $degrees")
    updateWeather(degrees)
    betterUpdateWeather(degrees)
}
