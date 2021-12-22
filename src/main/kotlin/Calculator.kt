import java.lang.IllegalArgumentException

class Calculator {

    fun insertNumber() : Int {
        return readLine()!!.toInt()
    }

    fun insertOperator() : String {
        val operator = readLine()!!
        if(operator != "+" && operator != "-" && operator != "/" && operator != "*") {
            throw IllegalArgumentException("존재하지 않은 연산자")
        }

        return operator
    }

    fun calculate(operator: String, number: Int, number2: Int) : Int {
        var result : Int = 0

        when(operator) {
            "+" -> result = number + number2
            "-" -> result = number - number2
            "*" -> result = number * number2
            "/" -> result = number / number2
        }
        return result
    }

    fun isAnswerY(input: String) : Boolean {
        if(input != "Y" && input != "N") {
            throw IllegalArgumentException("대답 똑바로 해라!")
        }

        return input == "Y"
    }

}

fun main() {
    var calculator : Calculator = Calculator()
    var checkStarter : Int = 1

    while (checkStarter == 1) {
        print("숫자를 입력하세요 : ")
        val insertNumber = calculator.insertNumber()
        print("연산자를 입력하세요 (+, -, *, /) : ")
        val insertOperator = calculator.insertOperator()
        print("숫자를 입력하세요 : ")
        val insertNumber2 = calculator.insertNumber()
        println("결과 : " + calculator.calculate(insertOperator, insertNumber, insertNumber2))

        print("종료하시겠습니까? (Y/N) : ")
        if (calculator.isAnswerY(readLine()!!)) {
            checkStarter = 0
        }
    }


}