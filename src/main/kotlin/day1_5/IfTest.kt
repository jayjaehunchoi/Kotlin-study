fun main(args: Array<String>) {

    ifBasic()
    ifExpression()
}

private fun ifBasic() {
    val a = 10
    val b = 15

    if (a < b) {
        println("b가 a 보다 크다 b = $b a = $a")
    } else {
        println("b가 a 보다 작거나 같다 b = $b a = $a")
    }
}

private fun ifExpression() {

    val a = 10
    val b = 5

    val value: Int = if(a > b) {
        println("a가 b보다 크다")
        a
    }else {
        println("a가 b보다 작거나 같다")
        b
    }

    println(value)
}

