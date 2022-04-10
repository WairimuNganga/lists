fun main(){

    val givenList = (wordsStr(listOf("mm","kk","ll","tt","yy","uu","oo","rr","ee","ww")))
    println(givenList)
    var getHeight = height(listOf(45.0,32.5,23.1,67.3))
    println(getHeight)

    var wendy = Person("Wendy","32",32.2,56.4)
    var mary = Person("Mary","24",29.2,54.7)
    var tom = Person("Tom","23",26.7,58.9)
    var josh = Person("Josh","19",42.5,31.2)
    var people = mutableListOf<Person>(wendy,mary,tom,josh)
    var peoplesAge = people.sortedByDescending { person ->  person.age}
    println(peoplesAge)

    var anna =Person("Kyla","3",3.2,15.5)
    var kyla =Person("Kyla","3",3.2,15.5)
    var addition = (mutableListOf(kyla,anna))
    println(addition.plus(peoplesAge))

    var saloon = Car("KDA 213K",32.0)
    var prado = Car("KCE 613K",51.6)
    var wagon = Car("KFE",29.9)
    var cars = listOf<Car>(saloon,prado,wagon)
    println(takeCars(cars))






}
/*Given a list of ten strings,write a function that returns a list of the strings
at even indices
 */
fun wordsStr(strList: List<String>):List<String>{
  var words = mutableListOf<String>()
    strList.forEachIndexed {index,word->
        if(index%2==0){
            words.add(word)
        }
    }
    return words


}
/*Given a list of people's heights in meters.Write a function that returns
the average height and the total height
 */
fun height(peoplesHeight:List<Double>):String{
    var total = peoplesHeight.sum()
    var avg = peoplesHeight.average()
    var result = "$total,$avg"
    return result
}
/*Given a list of Person objects, each with the attributes, name, age,
height and weight. Sort the list in order of descending age
 */
 data class Person(var name:String,var age:String,var height:Double,var weight:Double)

/*Given a list similar to the one above, write a function in which you will
create 2 more people objects and add them to the list at one go.
 */
fun addPersons(person:List<Person>):List<Person>{

    return mutableListOf<Person>()

}
/*Write a function that takes in a list of Car objects each with a
registration and mileage attribute and returns the average mileage of
all the vehicles in the list.
 */
data class Car(var registration:String,var mileage:Double)
fun takeCars(car:List<Car>):Double{
    var total = 0.0
    car.forEach{eachCar->
        total+=eachCar.mileage

    }

    return total/car.count()

}