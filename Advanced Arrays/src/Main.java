import java.io.*;
public class Main {
    public static void main(String[] args) {
        //Arrays
        String[] supplies = {"buns", "patties", "bottles of mustard", "bottles of ketchup", "slices of cheese", "tomatoes", "pieces of lettuce", "pickles"};
        System.out.println("Printing out supplies for burger stand:");
        for (int i = 0; i < supplies.length; i++) {
            System.out.println(supplies[i]);
        }

        //Advanced Arrays
        var search = "";
        String[][] supplies2 = {{"buns", "patties", "bottles of mustard", "bottles of ketchup", "slices of cheese", "tomatoes", "pieces of lettuce", "pickles"}, {"100", "100", "3", "6", "75", "50", "50", "40"}};
        Console str = System.console();
        System.out.println("What item would you like to look for?");
        search = (str.readLine());
        for (int i = 0; i < supplies2.length; i++) {
            if(search.equalsIgnoreCase(supplies[i])){
                System.out.println("We currently have " + supplies2[i][i] + " of this item.");
            }
        }
    }
}