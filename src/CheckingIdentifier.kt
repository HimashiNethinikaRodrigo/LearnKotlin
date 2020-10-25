fun isValidIdentifier1(s: String): Boolean {
    fun isValidCharacter(ch: Char)  =
        ch =='_' ||ch in 'a'..'z'
                || ch in 'A'..'Z' || ch in '0'..'9'

    fun isValidFirstLetter (ch:Char) =
        ch == '_' || ch in 'a'..'z'  || ch in 'A'..'Z'

    if (s.isEmpty() || !isValidFirstLetter(s[0]))
        return false
    else {
        for (ch in s) {
            if (!isValidCharacter(ch))
                return false
        }
        return true
    }
}

fun isValidIdentifier2(s: String): Boolean {
    fun isValidCharacter(ch: Char)  =
        ch =='_' || ch.isLetterOrDigit()

    fun isValidFirstLetter (ch:Char) =
        ch == '_' || ch.isLetter()

    if (s.isEmpty() || !isValidFirstLetter(s[0]))
        return false
    else {
        for (ch in s) {
            if (!isValidCharacter(ch))
                return false
        }
        return true
    }
}


fun main() {
    println(isValidIdentifier2("name"))   // true
    println(isValidIdentifier2("_name"))  // true
    println(isValidIdentifier2("_12"))    // true
    println(isValidIdentifier2(""))       // false
    println(isValidIdentifier2("012"))    // false
    println(isValidIdentifier2("no$"))    // false
}