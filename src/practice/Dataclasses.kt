package practice

fun main(args: Array<String>) {
    val book: Book = Book("SupremPower", "SupremPower.com", 5)


    println("Name of the Compony is--"+book.name) // "Suprempower"
    println("Puclisher Name--"+book.publisher) // "suprempower.com"
    println("Review of the Company is--"+book.reviewScore) // 5
    book.reviewScore = 7
    println("Printing all the info all together--"+book.toString())
    //using inbuilt function of the data class

    println("Example of the hashCode function--"+book.hashCode())
}

data class Book(val name: String, val publisher: String, var reviewScore: Int)