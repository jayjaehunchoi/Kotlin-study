package day7

import java.time.LocalDate

class Building constructor(var name : String, var date : LocalDate) {

    fun print() {
        println("빌딩 명 = $name , 날짜 = $date")
    }
}

class Room constructor(name : String, area : Int){

    var name : String
    var area : Int

    init {
        this.name = name
        this.area = area
    }
}

fun main() {
    var building = Building("삼보빌딩", LocalDate.of(2015, 1, 10))
    building.print()

    var room = Room("101호", 10)



}