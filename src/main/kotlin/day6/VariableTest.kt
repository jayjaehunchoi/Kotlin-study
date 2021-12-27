package day6

var count = 0
fun main() {
    val a = 10

    println(a + ++count)

    // 지역함수로, main에서만 사용 가능
    fun printMessage(message: String) {
        print(message)
    }


}

