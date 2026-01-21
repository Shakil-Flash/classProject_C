import kotlin.text.compareTo

fun main() {
    print("Enter three number: ")
    val (a,b,c) = readLine()!!.split(" ").map { it.toInt() }
    val smallest1 = small(a,b,c)
    println(smallest1)

}

val small= {x:Int,y: Int,z: Int ->
    if(x < y && x < z){
        "X is smallest"
    }else if (y < x && y < z){
        "Y is smallest"
    }else "Z is smallest"
}