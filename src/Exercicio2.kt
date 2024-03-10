fun main() {
    println("digite um numero")
    while(true) {
        val n = readln().toInt()
        println("O número $n ${if(n.isFibonacciNumber()) "é" else "não é"} um número da sequência de fibonnaci.")
    }
}

fun Int.isFibonacciNumber(): Boolean {
    val fibonnacciSequence = generateSequence(Pair(0, 1), {Pair(it.second, it.first + it.second)})
        .map{ it.first }
    for(num in fibonnacciSequence) {
        if(num == this) return true
        // se o número na sequência de fibonnaci for maior siginifica que esse número não faz parte da sequencia
        if(num > this) break
    }
    return false
}