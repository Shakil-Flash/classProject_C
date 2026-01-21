fun main(){
    print("Enter a number: ")
    val a = readLine()!!.toInt()
    print("Enter another number: ")
    val b = readLine()!!.toInt()

    val multi = higherOrder(a,b){x,y -> x * y}
    print("Multiplication of those is: $multi")
}





fun higherOrder(a: Int, b: Int,operation:(Int, Int) -> Int ): Int{
    return operation(a, b)
}