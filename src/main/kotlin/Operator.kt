fun main(args: Array<String>) {
    compareOperator()
    logicalOperator()
}

private fun compareOperator() {
    var isRight: Boolean = (10 + 70) > (3 * 25)
    println(isRight)

    isRight = 30 == 3 * 10
    println(isRight)
}

private fun logicalOperator() {

    val a = 10
    val b = 5

    var isRight: Boolean = (a + b > 0) && (a * b > 0)
    println(isRight)

    isRight = (a - b > 10) || (a + b > 10)
    println(isRight)
}