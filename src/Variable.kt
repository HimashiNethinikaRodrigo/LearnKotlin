/*
val - corresponds final variable / can be modified
var - mutable
 */

fun valFunction() {
    //Read only list, cannot add values to it
    val readOnlyList = listOf("Java")
    //readOnlyList.add("Kotlin")

    //mutable list
    val mutableList = mutableListOf("Java")
    mutableList.add("Kotlin")
}