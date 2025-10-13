import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateTimeApiExample {
    public static void main(String[] args) {
        LocalDate today = LocalDate.now();
        System.out.println("Today's date: " + today);

        LocalDate dateIn10Days = today.plusDays(10);
        System.out.println("Date in 10 days: " + dateIn10Days);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        String formattedDate = today.format(formatter);
        System.out.println("Formatted date: " + formattedDate);
    }
}