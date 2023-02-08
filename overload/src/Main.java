import java.io.*;
public class Main {
    public static void main(String[] args) {
        var name = "";
        var business = "";
        var number = "";
        System.out.println("Greetings! Are you a: ");
        System.out.println("A.) Residential customer?");
        System.out.println("B.) Business customer?");
        Console input = System.console();
        var type = input.readLine();
        switch(type){
            case "A":
                System.out.println("What is your name?");
                name = input.readLine();
                System.out.println("What is your phone number?");
                number = input.readLine();
                customer(name, number);
                break;
            case "B":
                System.out.println("What is the name of your business?");
                business = input.readLine();
                System.out.println("What is your name?");
                name = input.readLine();
                System.out.println("What is your phone number?");
                number = input.readLine();
                customer(business, name, number);
                break;
            default:
                System.out.println("Wrong input detected, try again.");
                break;
        }

    }
    private static void customer(String name, String number){
        var first = name;
        var second = number;
        System.out.println("Name: " + first + "\nPhone Number: " + second);
    }
    private static void customer(String business, String name, String number){
        var first = business;
        var second = name;
        var third = number;
        System.out.println("Business Name: " + first + "\nName: " + second + "\nPhone Number: " + third);
    }
}