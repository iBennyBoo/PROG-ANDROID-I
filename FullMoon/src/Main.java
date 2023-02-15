import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        int year = Calendar.getInstance().get((Calendar.YEAR));
        var formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        var today = LocalDate.now();
        var moon = LocalDate.of(2023,3,7);
        var formattedToday = today.format(formatter);
        var formattedMoon = moon.format(formatter);

        System.out.println("Today is " + formattedToday);
        System.out.println("Next Full Moon is on " + formattedMoon);

        var daysToMoon = today.until(moon, ChronoUnit.DAYS);
        System.out.println("The next full moon is in " + daysToMoon + " days.");




    }
}