import java.awt.Color

// when to check several values at once
fun respondToInput (input: String){
    when (input) {
        "y", "yes" -> "Yeah, you agree"
        "n", "no" -> "Sorry to hear that"
        else -> "I don't understand you"
    }
}

// expression to use as branch condition
fun mix (c1: Color, c2:Color) =
    when (setOf(c1, c2)){
        setOf(Color.RED, Color.YELLOW) -> Color.ORANGE
        setOf(Color.YELLOW, Color.BLUE) -> Color.GREEN
        setOf(Color.BLUE, Color.CYAN) -> Color.PINK
        else -> throw Exception("Dirty Color")
    }

// checking types- smart cars
fun animalCheck(pet:Pet) {
    when (pet) {
        is Cat -> pet.meow()
        is Dog -> pet.woof()
        else -> "---"
    }
}

// in as when condition
fun recognize(c: Char) = when (c) {
    in '0'..'9' -> "It's a digit!"
    in 'a'..'z', in 'A'..'Z' -> "It's a letter"
    else -> "I don't know"

}

fun main(){
    println(recognize('$'))
}

open class Pet
class Cat: Pet(){
    fun meow(){}
}
class Dog: Pet(){
    fun woof(){}
}
