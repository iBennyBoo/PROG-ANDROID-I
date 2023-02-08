import java.io.*;
import java.text.DecimalFormat;
public class Main {
    public static void main(String[] args) {
        var amount = -1.0;
        var total = 0.0;
        Console input = System.console();
        DecimalFormat df = new DecimalFormat("####.##");
        System.out.println("Welcome to the tip calculator! Please enter all of your item prices.");
        System.out.println("Enter '0' when you are finished");
        amount = Double.parseDouble(input.readLine());
        while (amount != 0){
            total = total + amount;
            System.out.println("Next Item.");
            amount = Double.parseDouble(input.readLine());
        }
        System.out.println("Total: $" + df.format(total));
        System.out.println("Taxes: $" + df.format(total * 0.025));
        System.out.println("Total w/ Taxes: $" + df.format(total + (total * 0.025)));
        System.out.println("We recommend a 17.5% tio, but how much do you want to leave?");
        var tip = Double.parseDouble(input.readLine());
        System.out.println("Tip: $" + tip);
        System.out.println("Grand total: $" + df.format(total + (total * 0.025) + tip));

    }
}