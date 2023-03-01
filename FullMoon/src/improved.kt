import java.time.LocalDate
import java.time.format.DateTimeFormatter
import java.time.temporal.ChronoUnit
import java.util.*

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        val year = Calendar.getInstance()[Calendar.YEAR]
        val formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy")

        //getting users system date
        val today = LocalDate.now()

        //date of next full moon
        val moon = LocalDate.of(2023, 3, 7)

        //formatted
        val formattedToday = today.format(formatter)
        val formattedMoon = moon.format(formatter)
        println("Today is $formattedToday")
        println("Next Full Moon is on $formattedMoon")

        //days until full moon
        val daysToMoon = today.until(moon, ChronoUnit.DAYS)
        println("The next full moon is in $daysToMoon days.")
    }
}