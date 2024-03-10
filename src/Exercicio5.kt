fun main() {
 while(true) {
     println(readln().inverter())
 }
}

fun String.inverter(): String {
    val copy = this.toMutableList()
    for(i in 0..(this.lastIndex )) {
        copy[i] = this[this.lastIndex - i]
    }
    return copy.joinToString("")
}