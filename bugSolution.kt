fun main() {
    val mutableList = mutableListOf(1, 2, 3, 4, 5)
    mutableList.replaceAll { it * 2 }
    println(mutableList) // Output: [2, 4, 6, 8, 10]

    //Alternatively, using a for loop:
    val anotherMutableList = mutableListOf(1, 2, 3, 4, 5)
    for (i in anotherMutableList.indices) {
        anotherMutableList[i] *= 2
    }
    println(anotherMutableList) // Output: [2, 4, 6, 8, 10]
}