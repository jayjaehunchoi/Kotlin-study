# Stack & Heap

Kotlin도 자바와 메모리 구조가 완벽히 같다.
복습 차원에서 다시 한 번 간단하게 정리해보았다.

먼저 간단하게 클래스를 하나 만들어준다.
```kotlin
class Product {
    var name = ""
    var price = 0

    constructor(name: String, price: Int) {
        this.name = name
        this.price = price
    }

    fun printProductInfo() {
        println("name = $name, price = $price")
    }
}
```

위 클래스를 활용하여 아래와 같이 ```main```메서드와 추가 메서드를 생성한다.

```kotlin
fun main() {
    val product = Product("사과", 1000)
    println("main 객체 주소 = $product")
    product.printProductInfo()

    println("가격 = " + calculateTotalPrice(product, 10))

    increasePrice(product)
    product.printProductInfo()
}

fun increasePrice(product: Product) {
    println("increasePrice 객체 주소 = $product")
    product.price *= 5
}

fun calculateTotalPrice(product : Product, amount : Int) : Int{
    println("calculateTotalPrice 객체 주소 = $product")
    return product.price * amount
}
```
위 메서드를 메모리로 정리하면 하단과 같다.

![image](https://user-images.githubusercontent.com/87312401/147865819-586f37c0-6c80-4674-8ba7-b8ae9a9edb7b.png)

동일한 객체를 Heap영역의 주소로 참조하여 매번 새로운 객체가 생성되지 않아 메모리를 아낄 수 있고
참조 값의 내용이 변경될 경우 해당 참조를 이용하는 모든 객체는 변동된다.

하지만 매번 새로운 객체가 생성되는 순간이 있다. 바로 ```String```의 덧셈이다. (자바의 immutable 덧셈)

```kotlin
private fun stringOperation() {
    val a = "Hello"
    val b = " World"

    val c = a + b
    println(c)
}
```
![image](https://user-images.githubusercontent.com/87312401/147865820-bfe941d7-4edc-44d4-b5bb-6a4718fedef4.png)

위 코드처럼 불변객체를 계속 셈하면, Heap 영역에 계속해서 객체가 생성된다. 만약 10만회의 반복문이 불변 객체에 연산을 한다면, 메모리 손실이 너무 심해진다.

따라서 매번 객체 관계를 끊어주거나 (이것도 메서드가 끝나기 전까지는 메모리 손실이 크다) , StringBuilder를 사용하는 방법이 존재한다.

```kotlin
var sb : StringBuilder = java.lang.StringBuilder()
sb.append(a)
sb.append(b)
```