package rsk

import java.math.BigInteger

fun main(args: Array<String>) {
    println(fib(10, BigInteger("1"), BigInteger("0")))
}

// recursive function -> creating a fibonacci sequence
// in tailrec there is no stack overflow for a heavily recursive function
tailrec fun fib(n: Int, a: BigInteger, b: BigInteger): BigInteger{
    return if (n == 0) b else fib(n - 1, a + b, a)
}

