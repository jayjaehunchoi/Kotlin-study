package day6

fun main(args:Array<String>): Unit{
    println(getAverage(1, 2))
    println(getAverageShort(3, 4))

    // 매개변수 이름을 지정한 인수는 항상 일반인수의 오른쪽에 위치해야함함
    println(getAverageDefault(flag = true))

    println(getVariableAverage(1, 2, 3, 4, 5, 6))
}

fun getAverage(a:Int, b:Int): Double{
    return (a + b) / 2.0;
}

// 한줄일 경우 축약해서 표현 가능
fun getAverageShort(a:Int, b:Int): Double = (a + b) / 2.0

fun getAverageDefault(a:Int = 0, b:Int = 0, flag:Boolean = false): Double {
    if(flag) {
        return (a + b) / 2.0;
    }
    return -1.0
}

fun getVariableAverage(vararg numbers:Int): Double {
    val count = numbers.size
    var i = 0;
    var sum = 0;

    while(i < count) {
        sum += numbers[i++]
    }

    return sum / count.toDouble();
}