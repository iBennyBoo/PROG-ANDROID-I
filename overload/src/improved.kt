fun improved(){
    var name = ""
    var business = ""
    var number = ""
    println("Greetings! Are you a: ")
    println("A.) Residential customer?")
    println("B.) Business customer?")
    val input = System.console()
    val type = input.readLine()
    when (type) {
        "A" -> {
            println("What is your name?")
            name = input.readLine()
            println("What is your phone number?")
            number = input.readLine()
            customer(name, number)
        }

        "B" -> {
            println("What is the name of your business?")
            business = input.readLine()
            println("What is your name?")
            name = input.readLine()
            println("What is your phone number?")
            number = input.readLine()
            customer(business, name, number)
        }

        else -> println("Wrong input detected, try again.")
    }
    fun customer(name: String, number: String) {
        val first = name
        val second = number
        println("Name: $first\nPhone Number: $second")
    }

    fun customer(business: String, name: String, number: String) {
        val first = business
        val second = name
        val third = number
        println("Business Name: $first\nName: $second\nPhone Number: $third")
    }
}