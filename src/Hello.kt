/*
Kotlin -
general purpose language
supports both object oriented programming paradigms and functional programming
Safe, interoperability with java(support all java frameworks), tool friendly, concise
Android, Server side development
Kotlin/JVM, Kotlin/JS, Kotlin/Native

Kotlin Compiled to Java byte code
.java ---------- .class
.kt   ---------- .class

 */

fun main(args: Array<String>) {
    val name = "World"
    println("Hello, $name!")
    println("It's a sunny and warm day!")
    println("First ${foo()}, Second ${foo()}")
}

fun foo(): String {
    println("Calculating Foo")
    return "foo"
}