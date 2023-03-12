/**
 * @author Ben Berman
 * Date March 4th 2023
 */
class residential(customerName: String, customerPhone: String,
                  customerAddress: String, squareFootage: Double,
                  propertyName: String, rate: Double, senior: Boolean): customer(customerName, customerPhone, customerAddress, squareFootage){

    var propertyName: String = "";
    var rate: Double = 6.0;
    var senior: Boolean = true;
    init {
        this.propertyName = propertyName;
        this.rate = rate;
        this.senior = senior;
    }

    fun setSenior(x: Boolean){
        this.senior = x;
    }

    /**
     * the charge function calculates weekly charges
     * if the senior field is set to true then provide a 15% discount
     * calls the display function
     */
    fun charge(x: Double){
        var answer: Double = 0.0;
        if(senior == true){
            answer = (squareFootage / 1000) * rate;
            answer -= (answer * 0.15);
        } else{
            answer = (squareFootage / 1000) * rate;
        }
        var text = display(customerName, customerPhone, customerAddress, propertyName, answer);
        println(text);
    }

    /**
     * the display function displays all the information in a nicely formatted string
     */
    fun display(v: String, w: String, x: String, y: String, z: Double): String {
        return "Name: $v \n Phone Number: $w \n Address: $x \n Property Name: \n Charge: $$z"
    }
}