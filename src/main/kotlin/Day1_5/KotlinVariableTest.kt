fun main(args: Array<String>) {
    kotlinVariable()
}
// 코틀린의 변수
fun kotlinVariable() {
    var total: Int = 0;

    // val은 불변, 자바의 final 과 유사
    // 코틀린에는 원시자료형이 없음, 모두 래퍼클래스. 그러나 null, 제너릭을 사용하지 않는한 코틀린 컴파일러가 최적화 해줌.
    val a: Int = 10 + 53 - 7
    println(a);

    val b: Int = 43 + 75 + a
    println(b);

    total = a + b
    println(total)
}