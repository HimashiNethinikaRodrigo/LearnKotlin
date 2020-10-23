/*
while loop - same as in Java

while (condition) {
}
 */

/*
do while loop - same as in Java

do {

} while (condition)

 */

// for loop
fun forLoopElementType() {
    val list = listOf("a", "b", "c")
    for (s in list) {
        print(s)
    }
}

fun forLoopIterating() {
    val map = mapOf( 1 to "one", 2 to "two", 3 to "three")
    val list = listOf( 1 to "one", 2 to "two", 3 to "three")

    //iterating over map
    for((key, value) in map) {
        println("$key = $value")
    }

    //iterating with index
    for((index, element) in list.withIndex()) {
        println("$index = $element")
    }

    //iterating over range - include upper and lower bound
    for (i in 1..9) {
        print(i) // 123456789
    }

    //iterating over range - exclude upper bound include lower bound
    for (i in 1 until 9) {
        print(i) // 12345678
    }

    //iterating over range with step including upper and lower bound
    for (i in 9 downTo 1 step 2) {
        print(i) // 97531
    }

    for (ch in "abc") {
        print(ch + 1) //bcd
    }
}

fun main(){
    forLoopIterating()
}

