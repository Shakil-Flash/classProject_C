fun main() {
    var start = true

    print("" +
            "")

    var student1 = Student(101,"Mafi","mafikafi@gmail.com","017734374")
    var student2 = Student(202,"Sakibul Hasan", "sakibulhasan14@gmail.com", "018334734")

    student1.displayInfo()
    println("--------------------------------------")
    Thread.sleep(1000)
    student2.displayInfo()

}


class Student(
    val id: Int,
    val name: String,
    val email: String,
    val phone: String, )

{
    fun displayInfo() {
    println("Id: $id")
    println("Name: $name")
    println("Email: $email")
    println("Phone: $phone")
}
}
