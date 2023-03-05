import java.util.*

/**
 * @author Ben Berman
 * Date March 4th 2023
 */
fun main(){
    println("1.) Residential Customer")
    println("2.) Commercial Customer")
    println("3.) Done")
    println("What would you like to do?")
    val scan = Scanner(System.`in`)
    val n = scan.nextLine().toInt()
    when (n) {
        1 -> one()
        2 -> two()
        3 -> println("Have a good day")
        else -> {
            print("Error: Not an option")
        }
    }
}

/**
 * calls the residential class
 * inherited from customer class
 */
fun one(){
    val scan = Scanner(System.`in`)
    println("What is your name?")
    val name = scan.nextLine()
    println("What is your phone number?")
    val number = scan.nextLine()
    println("What is your address?")
    val address = scan.nextLine()
    println("How many square feet is your property?")
    val feet = scan.nextLine().toDouble()

    println("What is the property name?")
    val propName = scan.nextLine()
    println("Are you a senior (1 for yes and 2 for no)")
    var choice = scan.nextLine().toInt()
    var senior = false
    when(choice){
        1 -> senior = true
        2 -> senior = false
        else -> {
            print("Error: Not an option")
        }
    }
    var person1 = residential(name, number, address, feet, propName, 6.0, senior)
    person1.charge(feet)
}

/**
 * calls the commercial class
 * inherited from customer class
 */
fun two(){
    val scan = Scanner(System.`in`)
    println("What is your name?")
    val name = scan.nextLine()
    println("What is your phone number?")
    val number = scan.nextLine()
    println("What is your address?")
    val address = scan.nextLine()
    println("How many square feet is your property?")
    val feet = scan.nextLine().toDouble()

    println("What is the property name?")
    val propName = scan.nextLine()
    println("How many properties do you have?")
    val propNumber = scan.nextLine().toInt()
    var person2 = commercial(name, number, address, feet, propName, 5.0, propNumber)
    person2.charge(feet)
}