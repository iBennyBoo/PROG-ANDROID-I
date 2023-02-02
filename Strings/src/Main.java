import java.io.*;
public class Main {
    public static void main(String[] args) {

        var count = 0;
        var answer1 = "purple"; //color after blue in the rainbow
        var answer2 = "newspaper"; //whats black and white and red all over?
        var answer3 = "you"; //fill in the blank: 'scooby dooby doo, where are ___?'
        var answer4 = "up"; //the opposite of down
        var answer5 = "pink"; //an optional color of lemonade

        var guess = "";
        Console str = System.console();
        System.out.println("Let's play a word game!");
        System.out.println("What is the color after blue in the rainbow?");
        guess = (str.readLine());
        if (guess.equalsIgnoreCase(answer1) == true){
            count++;
            System.out.println("Correct!");
        } else if (guess.equalsIgnoreCase(answer1) == false) {
            System.out.println("Incorrect!");
        }
        System.out.println("What's black and white and red all over?");
        guess = (str.readLine());
        if (guess.equalsIgnoreCase(answer2) == true){
            count++;
            System.out.println("Correct!");
        } else if (guess.equalsIgnoreCase(answer2) == false) {
            System.out.println("Incorrect!");
        }
        System.out.println("Fill in the blank: 'scooby dooby doo, where are ___?");
        guess = (str.readLine());
        if (guess.equalsIgnoreCase(answer3) == true){
            count++;
            System.out.println("Correct!");
        } else if (guess.equalsIgnoreCase(answer3) == false) {
            System.out.println("Incorrect!");
        }
        System.out.println("The opposite of down.");
        guess = (str.readLine());
        if (guess.equalsIgnoreCase(answer4) == true){
            count++;
            System.out.println("Correct!");
        } else if (guess.equalsIgnoreCase(answer4) == false) {
            System.out.println("Incorrect!");
        }
        System.out.println("An optional color of lemonade.");
        guess = (str.readLine());
        if (guess.equalsIgnoreCase(answer5) == true){
            count++;
            System.out.println("Correct!");
        } else if (guess.equalsIgnoreCase(answer5) == false) {
            System.out.println("Incorrect!");
        }

        System.out.println("You got " + count + " out of 5 right!");
    }
}