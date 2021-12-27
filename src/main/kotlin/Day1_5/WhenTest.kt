fun main(args : Array<String>) {
    // !! 은 non null, null일 경우 exception
    // ? 은 null 값을 사전에 선정해줄 수 있음
    val score : Int = readLine()!!.toInt()

    when(score / 10) {
        9, 10 -> {println('A')}
        8 -> {println('B')}
        7 -> {
            println('C')}
        else -> {
            println('F')
        }
    }

}