import java.io.File
import java.util.ArrayList

fun insertionSort(items: MutableList<Int>):List<Int>{
    if (items.isEmpty() || items.size<2){
        return items
    }

    for (count in 1 until items.count()){
        // println(items)
        val item = items[count]
        println(item)
        var i = count
        while (i>0 && item < items[i - 1]){
            items[i] = items[i - 1]
            i -= 1
        }

        items[i] = item
    }
    return items

}

fun main() {
   /* val file = File("data.txt")
    val bufferedReader = file.bufferedReader()
    val text: List<String> = bufferedReader.readLines()

    val number:Int = Integer.valueOf(readLine())*/

    val names = mutableListOf(9,5,6,8,7,6,2,5,9)
    var ordered = insertionSort(names)
    println(ordered)



   /* for(cafeString in text){
       // var str:String = cafeString
        var num:Int = cafeString.toInt()
        val list = ArrayList<Int>(5)
        list.add(num)
        val index = list[0]
        // pass(num)
    }*/
}



