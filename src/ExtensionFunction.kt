//extension function for String class.
//extension function allow nicer and more convenient way to write function
// if we have same name member function and extension function always member function wins
// extension can't ide a member completely, but can overload it
// no override for extension functions in Kotlin
//Can't call private members from extension
// Can use lastChar() function as member function
//String - this is receiver of lastChar() function
//we can access receiver inside function using this keyword
fun String.lastChar1() = this.get(this.length-1)
// implement lastChar() function without using this key word
fun String.lastChar2() = get(length-1)

fun main(){
    // we have ti import the lastChar function explicitly to use it
    // when the extension function is written in different class than its calling place
    //import edu.example.extensionFunction.lastChar - import like this
    val c:Char ="abcz".lastChar2()
    println(c)

    // formatting multiline strings
    val a ="""To code,      or not to code?..""".trimMargin()

    val b = """To code,
         
        or not to code?..""".trimIndent()

    println(a)
    println(b)
}