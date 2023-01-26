import java.io.*;
public class Main {
    public static void main(String[] args) {
        var number = 8;
        var guess = 0;
        Console str = System.console();
        while(guess != number){
            System.out.println("Guess a number between 1-10!");
            guess = Integer.parseInt(str.readLine());
            if(guess == number){
                System.out.println("You got it right!");
            } else{
                System.out.println("You got it wrong... try again!");
            }
        }
    }
}