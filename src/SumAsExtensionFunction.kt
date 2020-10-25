fun sum(list: List<Int>): Int {
    var result = 0
    for (i in list) {
        result += i
    }
    return result
}

fun List<Int>.sum1(): Int {
    var result = 0
    this.forEach {
        result+= it
    }
    return result
}

fun main(args: Array<String>) {
    val sum = sum(listOf(1, 2, 3))
    val summation = listOf(1, 2, 3, 4).sum1()
    println(sum)    // 6
    println(summation) // 10
}