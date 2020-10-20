//@JvmName("Util") This can be used to change the file name to other

fun max1(a:Int, b:Int):Int {
    return if (a>b) a else b
}

// above method converted to expression body in below
fun max2(a:Int, b:Int) = if (a>b) a else b

// top level function - in Java call this as static function
// if we use JVM annotation this method can be call in Java as Util.topLevel()
// if annotation is not there can call as Function.topLevel()
fun topLevel() = 1

// member function
class A{
    fun member () = 2
}

//Local function
fun other() {
    fun local() = 3
}



