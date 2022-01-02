package memory

fun main() {
    stringOperation()
    kotlinEqualSign()

    var product : Product = Product("사과", 1000)
    var product2 : Product = Product("사과", 1000)

    println(product == product2)
}

// '==' java의 equals '===' java의 ==
private fun kotlinEqualSign() {
    var a = "one"
    var b = "one"
    println("a === b = ${a === b}")

    b = "on"
    b += "e"
    println("a !== b = ${a !== b}")

    b = a
    println("a == b = ${a == b}")

}

private fun stringOperation() {
    val a = "Hello"
    val b = " World"

    val c = a + b
    println(c)

    var sb : StringBuilder = java.lang.StringBuilder()
    sb.append(a)
    sb.append(b)
}