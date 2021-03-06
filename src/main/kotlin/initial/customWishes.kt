package initial

fun main(args: Array<String>) {

    println("Enter Message")
    val message = readLine()
    println("Enter Name")
    val name = readLine()
    wishes(message,name)
}

fun wishes(message: String?,name:String?) {
    println("$message $name")
}