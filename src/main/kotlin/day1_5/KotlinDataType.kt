// Unit은 void
fun main(args: Array<String>): Unit {
    kotlinLiteral()
    kotlinString()
    kotlinExpressionIntoString()
}

private fun kotlinLiteral() {
    // 정수를 적으면 리터럴은 자동으로 Int 타입이 됨.
    // 연산자 + 리터럴 타입 덕분에 표현식 결과에도 자연스레 Int 타입이 생기는 것임
    val variable = 10 + 12 - 5

    // 자바와 연선자 표현은 똑같음
    val num: Int = 15 - 4 * 3
    val num2: Int = 65 % 7

    val num3: Double = 7.5 / 5

    // 코틀린은 자바보다 타입체크에 엄격함
    // 따라서 아래와 같이 Double 타입으로 만들어줘야함.
    val num4: Double = 7.0 / 5

    // 형변환도 가능
    val num5: Double = num.toDouble() / 5
}

private fun kotlinString() {
    println("start kotlinString")
    var str: String = "Hello"
    println(str)

    // str = str + "\nKotlin!"
    str = "$str\nKotlin!"
    println(str)

    println(str[8])

    val num = 10 * 5 + 3
    println(str + num)

}

private fun kotlinExpressionIntoString() {
    println("start kotlinExpressionIntoString")
    val a = 10
    val b = 20

    println("a = $a")
    println("b = $b")
    println("a + b = ${a+b}")
}

