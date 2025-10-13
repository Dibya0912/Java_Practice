import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {
    public static void main(String[] args) {
        String text = "Contact us at help@example.com for support.";
        String emailRegex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";

        Pattern pattern = Pattern.compile(emailRegex);
        Matcher matcher = pattern.matcher(text);

        if (matcher.find()) {
            System.out.println("Found email address: " + matcher.group());
        } else {
            System.out.println("No email address found.");
        }
    }
}