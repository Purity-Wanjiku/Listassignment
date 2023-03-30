import java.util.Objects

fun main() {
//    val get = heightOfPeople(listOf(5,6,8))

    var getavg = heightOfPeople(listOf(20.0,30.0,12.0,40.0))
    println(getavg)

    personobjects()

    var objects = listOf<Car>(
            Car("KBY 456Y", 556.0),
            Car("KDE 123E",400.0),
            Car("KAW 208T",120.0),
            Car("KFA 334K",100.0)
    )
    val avgMileage = cars(objects)
    println(avgMileage)
}
//No. 1
//Given a list of 10 strings,
// write a function that returns a list of strings
// at even indices i.e. index2,3, etc


//No. 2
//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

fun heightOfPeople (height:List<Double>):Pair<Double,Double> {
    val avg = height.average()
    val sum = height.sum()
    return Pair(avg, sum)
}
//No. 3
//Given a list of Person objects, each with the attribute name, age, height and weight
//sort the list in order of the descending age

data class Person (var name:String, var age: Int, var height: Double, var weight:Int)

fun personobjects () {
    val person1 = Person("Hugo",30, 5.6, 54)
    val person2 = Person("Joan",15,4.8,56)
    val person3 = Person("Joan",18,6.3,66)

    val persons = listOf<Person>(person1,person2,person3)
    var sorted = persons.sortedByDescending { person -> person.age }
    println(sorted)
}
//No. 4
//Given a list similar to the one above,
//write a function in which you will create 2 more people objects
//and add them to the list at one go


//No. 5
//write a function that takes in a list of Car objects
// each with a registration and mileage of all the vehicles in the list
//and returns the average mileage of all vehicles in the list
data class Car (var registration:String, var mileage:Double)

fun cars (objects:List<Car>):Double {
    var carAverageMileage = 0.0
    for (i in objects){
        carAverageMileage += i.mileage
    }
return carAverageMileage / objects.size
}

