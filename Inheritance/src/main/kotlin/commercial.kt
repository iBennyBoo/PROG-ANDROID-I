/**
 * @author Ben Berman
 * Date: March 4th 2023
 */
class commercial(customerName: String, customerPhone: String,
                 customerAddress: String, squareFootage: Double,
                 propertyName: String, rate: Double, properties: Int): customer(customerName, customerPhone, customerAddress, squareFootage){

    var propertyName: String = "";
    var rate: Double = 5.0;
    var properties: Int = 0;
    init {
        this.propertyName = propertyName;
        this.rate = rate;
        this.properties = properties;
    }

    fun setProperties(x: Int){
        this.properties = x;
    }
    /**
     * the charge function calculates weekly charges
     * if they have multiple properties provide a 10% discount
     * calls the display function
     */
    fun charge(x: Double){
        var answer: Double = 0.0;
        if(properties > 1){
            answer = (squareFootage / 1000) * rate;
            answer -= (answer * 0.1);
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
/**
 * propertyName: the properties name
 * rate: the amount of money payed per ft^2
 * properties: the amount of properties the user has
 */