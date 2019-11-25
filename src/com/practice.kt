package com

class myClass {
    // property (data member)
    private var name: String = "Tutorials.point"

    // member function
    fun printMe() {
        print("You are at the best Learning website Named-"+name)
    }
}

fun main(args: Array<String>) {
    val obj = myClass() // create obj object of myClass class
    obj.printMe()
}