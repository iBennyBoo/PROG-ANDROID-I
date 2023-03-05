/**
 * @author Ben Berman
 * Date: March 4th 2023
 */

open class customer(customerName: String, customerPhone: String, customerAddress: String, squareFootage: Double){
    var customerName: String = "";
    var customerPhone: String = "";
    var customerAddress: String = "";
    var squareFootage: Double = 0.0;

    init {
        this.customerName = customerName;
        this.customerPhone = customerPhone;
        this.customerAddress = customerAddress;
        this.squareFootage = squareFootage;
    }
}
/**
 * customerName: the customers name
 * customerPhone: A string of the user's phone number
 * customerAddress: the address of the user
 * squareFootage: the ft^2 of the property
 */