import com.sanatana.arya.DisplayUI

class Person {
    var name = "Akshay"
    var age = 32

}

fun main(){
    var count: Int = 0
val nobject = Person()
val objref = DisplayUI()
    print("\nSelect the Options\n")
    for (i in 1..3){
        count++
        print("\n ${count} .${objref.dataScreen()} \n")
    }
    objref.dataScreen()
    print("user name is ${nobject.name}\n")
    print("User Age is ${nobject.age}")
}


