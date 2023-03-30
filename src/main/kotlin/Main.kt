fun main() {
//    val get = heightOfPeople(listOf(5,6,8))

    heightOfPeople(listOf(20,30,12,40))
}
//Given a list of 10 strings,
// write a function that returns a list of strings
// at even indices i.e. index2,3, etc



//Given a list of people’s heights in metres. Write a function that returns
//the average height and the total height

fun heightOfPeople (height:List<Int>){
    val avg = height.average()
    val sum = height.sum()
    println(avg)
    println(sum)
}

//Given a list of Person objects, each with the attribute name, age, height and weight
//sort the list in order of the descending age

data class Person (var name:String, var age: Int, var height: Double, var weight:Int)

fun personobjects () {
    val person1 = Person("Hugo"30, 5.6, 54)
    val person2 = Person("Joan"15,4.8,56)
    val person3 = Person("Joan"18,6.3,66)

    val persons = listOf<Person>(person1,person2,person3)
    println(persons)



}
//Given a list similar to the one above,
//write a function in which you will create 2 more people objects
//and add them to the list at one go


//write a function that takes in a list of Car objects each with a registration and mileage of all the vehicles in the list