package practice

interface myinterface{
    var myVar: Int
    fun aksmethod():String

    fun hello(){
        println("This is Logic of Today")
    }
}

class System : myinterface {
    override var myVar: Int = 25
    override fun aksmethod() = "Happy Birthday"
}


fun main() {
    val myobj = System()
    myobj.aksmethod()
    print(myobj.aksmethod())
    println("My var os value is=${myobj.myVar}")
}