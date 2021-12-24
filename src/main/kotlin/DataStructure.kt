fun main() {
    listStructure()
    setStructure()
    mapStructure()

}

private fun mapStructure() {
    val map = mapOf<Int, String>(1 to "wogns", 2 to "wogns1")
    var mutableMap = mutableMapOf<Int, String>();
    mutableMap[1] = "wogns"
    mutableMap.put(2, "wogns1")
}

private fun setStructure() {
    // 불변
    var set = setOf<Int>(1, 2, 3, 4)

    var mutableSet = mutableSetOf<Int>()
    mutableSet.add(1)
}

private fun listStructure() {
    var list = listOf(1, 2, 3, 4, 5, 6)

    println(list[0])

    var mutableList = mutableListOf<Int>();
    mutableList.add(7)
    print(mutableList[0])
}