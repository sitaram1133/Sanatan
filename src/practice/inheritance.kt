package practice



open class Appcompactivity(val akshay: String, val proffession: String) {
    fun think () {

        print("hey this is ${akshay}, You Have been Seleted ${proffession} Coarce now")
    }
}

class MainActivity(akshay: String, proffession: String) : Appcompactivity(akshay, proffession)
{ // inheritence happend using default constructor
 //override val akshay:String = "Aum Namah Shivay"
}

fun main(args: Array<String>) {
    val Akshay:String =""
    val proffession:String= ""
    var  a = MainActivity(Akshay,proffession)

    for (i in 1..9){
        var ans =0
        var values = 9
        values = values + 1
        ans = 3 % values
        print(ans)
        if (9 == 3 % values){
            a.think()
        }
    }

}