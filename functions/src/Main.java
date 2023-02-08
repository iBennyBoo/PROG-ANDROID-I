import java.io.*;
public class Main {
    public static void main(String[] args) {

        System.out.println("What shape would you like to find the area for?");
        System.out.println("1.) Hexagon");
        System.out.println("2.) Triangle");
        System.out.println("3.) Rectangle");
        System.out.println("4.) Trapezoid");
        System.out.println("Please enter a number 1-4.");
        Console x = System.console();
        var input = x.readLine();
        menu(input);
    }
    private static void menu(String x){
        x = String.valueOf(Integer.parseInt(x));
        switch (x){
            case 1:
                System.print("hexagon");
                circle();
                break;
            case 2:
                System.print("triangle");
                triangle();
                break;
            case 3:
                System.print("rectangle");
                rectangle();
                break;
            case 4:
                System.print("trapezoid");
                trapezoid();
                break;
            default:
                System.print("wrong");
                System.out.println("Not an option, please pick a number 1-4.");
                break;

        }
    }
    private static void circle(){
        //(pie)(R)^2
        Console one = System.console();
        System.out.println("What is the radius?");
        var radius = Integer.parseInt(one.readLine());
        var answer = Math.PI * (radius * radius);
        System.out.println("Answer is " + answer);
    }
    private static void triangle(){
        //(base * height)/2
        Console one = System.console();
        System.out.println("What is the length?");
        var length = Integer.parseInt(one.readLine());
        System.out.println("What is the height?");
        var height = Integer.parseInt(one.readLine);
        var answer = (length * height) / 2;
        System.out.println("Answer is " + answer);
    }
    private static void rectangle(){
        //(length)(width)
        Console one = System.console();
        System.out.println("What is the length?");
        var length = Integer.parseInt(one.readLine());
        System.out.println("What is the height?");
        var height = Integer.parseInt(one.readLine);
        var answer = length * height;
        System.out.println("Answer is " + answer);
    }
    private static void trapezoid(){
        //((length1 + length2)/2) * height
        Console one = System.console();
        System.out.println("What is the first length?");
        var length1 = Integer.parseInt(one.readLine());
        System.out.println("What is the second length?");
        var length2 = Integer.parseInt(one.readLine());
        System.out.println("What is the height?");
        var height = Integer.parseInt(one.readLine);
        var answer = ((length1 + length2)/2)*height;
        System.out.println("Answer is " + answer);
    }
}