fun main() {
    print("Enter three number in one line: ")
    val (a,b,c) = readLine()!!.split(" ").map { it.toInt() }
    smallest(a,b,c)

}

fun smallest(a: Int, b: Int, c: Int) {
    if(a < b && a < c){
        println("Smallest is a: $a")
    }else if (b < a && b < c){
        println("Smallest is b: $b")
    }else{
        println("Smallest is c: $c")
    }
}