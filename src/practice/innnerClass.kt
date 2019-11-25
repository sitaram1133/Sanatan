import java.util.Arrays

open class ABC {
    fun think () {
        print("Hey!! i am thiking ")
    }
}
class BCD: ABC(){ // inheritence happend using default constructor
}

fun main(args: Array<String>) {
    var  a = BCD()
    a.think()
}