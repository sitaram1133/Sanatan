package practice


fun main(args: Array<String>){
val demo = Outer()
    demo.coffee()
    val aks = Outer.Nested()
    print(aks.goodDay())

}

class Outer{
    fun coffee(){

    }
    class Nested{
        fun goodDay() = "www.mahashaktigroup.co"

    }
}