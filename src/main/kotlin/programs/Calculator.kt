package programs

import java.util.*

fun main(){
    println("********************************\nWelcome To AMR Calculator ...\n******************************** ")
    var isTerminated = false
    var scanner = Scanner(System.`in`)

    while(!isTerminated){
        println("Select Operation : 1.Add 2.Sub 3.Mul 4.Div 5.Percentage 6.Exit")
        try {
            var operation = scanner.nextLine().toInt()
            if(operation==6){
                println("Goodbye :)")
                isTerminated = true
                scanner.close()
                continue
            }
            println("Enter First Value")
            var firstValue = scanner.nextLine().toDouble()
            println("Enter Second Value")
            var secondValue = scanner.nextLine().toDouble()
            var result:Double = 0.0;
            when(operation) {
                1 -> println("$firstValue + $secondValue = "+(firstValue+secondValue))
                2 -> println("$firstValue - $secondValue = "+(firstValue-secondValue))
                3 -> println("$firstValue * $secondValue = "+(firstValue*secondValue))
                4 -> println("$firstValue / $secondValue = "+(firstValue/secondValue))
                5 -> println("$firstValue % $secondValue = "+(firstValue/secondValue)*100+"%")
                else -> println("Invalid Operation")
            }
        }catch (exception:Exception){
            println("Please Enter valid Date (Number format)")
        }
    }
}

