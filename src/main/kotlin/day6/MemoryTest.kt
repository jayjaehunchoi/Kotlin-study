package day6

// main 메서드 호출
fun main() {

    // stack 영역에 a = -36 생성
    val a = -36

    // getAbsolute 메서드 호출
    // 수행 종료 후 println 호출
    println(getAbsolute(a))

    // stack영역 전부 삭제 마무리
}

// 수행
fun getAbsolute(number: Int): Int{
    return if (number < 0)
        -number
    else
        number

}