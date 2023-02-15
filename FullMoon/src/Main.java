import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int year = Calendar.getInstance().get((Calendar.YEAR));
        var formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        
        //getting users system date
        var today = LocalDate.now();
        
        //date of next full moon
        var moon = LocalDate.of(2023,3,7);
        
        //formatted
        var formattedToday = today.format(formatter);
        var formattedMoon = moon.format(formatter);

        System.out.println("Today is " + formattedToday);
        System.out.println("Next Full Moon is on " + formattedMoon);

        //days until full moon
        var daysToMoon = today.until(moon, ChronoUnit.DAYS);
        System.out.println("The next full moon is in " + daysToMoon + " days.");




    }
}
