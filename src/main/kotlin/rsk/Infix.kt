package rsk

fun main(args: Array<String>) {
    val h1 = Header("H1")
    val h2 = Header("H2")

//    calling an infix function: plus as an infix
    val h3 = h1 plus h2

    println(h3.Name)

//    plus symbol acts as an operator -> operator overloading
    val h4 = h1 + h2
    println(h4.Name)
}

class Header(var Name: String){

}

// infix extension function: operator allows us to call the function using plus symbol
infix operator fun Header.plus(other: Header): Header{
    return Header(this.Name + other.Name)
}
