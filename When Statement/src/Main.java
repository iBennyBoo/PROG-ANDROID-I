import java.io.*;
public class Main {
    public static void main(String[] args) {
        var number = 0;
        var str = "";
        Console console = System.console();
        System.out.println("Enter a number 1-10 to get the Spanish translation!");
        number = Integer.parseInt(console.readLine());
        when(number){
                1 -> str = "uno"
                2 -> str = "dos"
                3 -> str = "tres"
                4 -> str = "cuatro"
                5 -> str = "cinco"
                6 -> str = "seis"
                7 -> str = "siete"
                8 -> str = "ocho"
                9 -> str = "nueve"
                10 -> str = "diez"
                !in 1..10 -> str = "Not in range"
                else -> str = "Unknown"
        }
        System.out.println(str);
    }
}