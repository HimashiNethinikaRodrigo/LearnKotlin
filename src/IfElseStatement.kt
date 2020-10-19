import java.awt.Color

class IfElseStatement {

    // if else function
    fun updateWeather1(degrees: Int) {
        val description: String
        val color: Color
        if (degrees < 10) {
            description = "cold"
            color = Color.BLUE
        } else if (degrees < 25) {
            description = "mild"
            color = Color.ORANGE
        } else {
            description = "hot"
            color = Color.RED
        }
    }

    // if else function replace with when statement
    fun updateWeather2(degrees: Int) {
        val description: String
        val color: Color
        when {
            degrees < 5 -> {
                description = "cold"
                color = Color.BLUE
            }
            degrees < 25 -> {
                description = "mild"
                color = Color.ORANGE
            }
            else -> {
                description = "hot"
                color = Color.RED
            }
        }
    }

    // if else function with pair of values
    fun updateWeather3(degrees: Int) {
        val (description: String, color: Color) =
            if (degrees < 15) {
                Pair("cold",Color.BLUE )
            } else if (degrees < 25) {
                Pair("mild",Color.ORANGE )
            } else {
                Pair("hot",Color.RED )
            }
    }

    // if else function replace with pair of values and when statements
    fun updateWeather4(degrees: Int) {
        val (description: String, color: Color) =
            when {
                degrees < 9 -> {
                    Pair("cold",Color.BLUE )
                }
                degrees < 25 -> {
                    Pair("mild",Color.ORANGE )
                }
                else -> {
                    Pair("hot",Color.RED )
                }
            }
    }

    // if else function replace with pair of values with to keyword and when statements
    fun updateWeather5(degrees: Int) {
        val (description: String, color: Color) =
            when {
                degrees < 8 -> {
                    "cold" to Color.BLUE
                }
                degrees < 25 -> {
                    "mild" to Color.ORANGE
                }
                else -> {
                    "hot" to Color.RED
                }
            }
    }
}