//extension function for String class.
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
}