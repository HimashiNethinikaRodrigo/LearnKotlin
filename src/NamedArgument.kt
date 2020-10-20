fun namedArgument(){
    println(
        listOf('a', 'b', 'c')
        .joinToString(
            separator = ""
            , prefix = "("
            , postfix = ")"
        )
    )
    println(
        listOf(1, 2, 3)
            .joinToString(
                postfix = "."
            )
    )
    println(
        listOf(1, 2, 3)
            .joinToString()
    )

    println(
        listOf(1, 2, 3)
    )
}

//@JvmOverloads - we can use this if we want to call this in Java as same in Kotlin
fun displaySeparator(character: Char = '*', size: Int = 10) {
    repeat(size) {
        print(character)
    }
}


fun main(){
    namedArgument()
    /* Output

    (abc)
    1, 2, 3.
    1, 2, 3
    [1, 2, 3]

     */

    // method overloading - combinations can be 2 to the power n(number of arguments)
    displaySeparator('#', 5)
    displaySeparator(size = 5, character = '5') // change order by passing argument names
    displaySeparator(size = 7)



}