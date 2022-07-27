fun main(args: Array<String>) {
    display("Hola!")
    println(max(13, 78))

    log("Bonjour", 19)

    val text = "With   multiple \t  whitespaces"
    println(text)

    println(replaceMultipleWhiteSpace(text))
//    calling an extension function
    println(text.replaceMultipleWhiteSpaceEx())
}

// one line function to find max
fun max(a: Int, b:Int): Int = if (a>b) a else b

fun display(message: String): Boolean{
    println(message)
    return true
}

// default parameter
fun log(message: String, loglevel: Int =1){
    println(message + loglevel)
}

fun replaceMultipleWhiteSpace(value: String): String{
    var regex = Regex("\\s+")
    return regex.replace(value, " ")
}

// using extension function
fun String.replaceMultipleWhiteSpaceEx(): String{
    var regex = Regex("\\s+")
//    receiver is this instead of value
    return regex.replace(this, " ")
}
