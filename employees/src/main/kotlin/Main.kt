fun main(args: Array<String>) {
    println("Hello World!")

    // Try adding program arguments via Run/Debug configuration.
    // Learn more about running applications: https://www.jetbrains.com/help/idea/running-applications.html.
    println("Program arguments: ${args.joinToString()}")
    var emp1 = employee("Ben", PositionTitle.Production, true, 27.00, 1);
    var emp2 = employee("Joe", PositionTitle.Sales, false, 22.00, 2);
    var emp3 = employee("John", PositionTitle.Administration, false, 21.00, 3);

    emp1.display();
    emp1.calculate(45.0);
    emp2.display();
    emp2.calculate(50.0);
    emp3.display();
    emp3.calculate(35.0);

}
enum class PositionTitle{
    Administration, Production, Sales, Maintenance, Technical, Secretarial
}

class employee(var name: String, var position: PositionTitle, var salary: Boolean, var payRate: Double, var shift: Int){
    init{
        // initializing block
    }
    var total = 0.0
    fun calculate(hoursIn: Double){
        if(shift == 2){
            payRate = payRate *  0.05;
        } else if (shift == 3){
            payRate = payRate * .1;
        }
        overtime(hoursIn);
        total = hoursIn * payRate;
    }

    fun overtime(hoursIn: Double){
        if (!salary){
            if (hoursIn > 40){
                payRate = payRate * 1.5;
            }
        }
    }

    fun display(){
        println("Name: " + name);
        println("Occupation: " + position);
        println("Payrate: $" + payRate);
        println("You have earned $" + total);
    }
}