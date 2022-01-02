package memory

class Product {
    var name = ""
    var price = 0

    constructor(name: String, price: Int) {
        this.name = name
        this.price = price
    }

    fun printProductInfo() {
        println("name = $name, price = $price" )
    }

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Product

        if (name != other.name) return false
        if (price != other.price) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + price
        return result
    }

}

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


