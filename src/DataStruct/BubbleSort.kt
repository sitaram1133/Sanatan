package DataStruct

fun main() {
    val list = bubbleSort(intArrayOf(9,5,3,6,8,7,3,1))
    for (k in list) print("$k ")
}

fun bubbleSort(unit:IntArray):IntArray{
    var swap = true
    while(swap){
        swap = false
        for(i in 0 until unit.size-1){
            if(unit[i] < unit[i+1]){
                val temp = unit[i]
                unit[i] = unit[i+1]
                unit[i + 1] = temp
                swap = true
            }
        }
    }
    return unit
}

