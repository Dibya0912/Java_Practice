import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class NIOFileExample {
    public static void main(String[] args) {
        Path file = Path.of("demo.txt");

        try {
            // Write to file
            String text = "Hello, this is a simple NIO example.";
            Files.writeString(file, text);
            System.out.println("File written successfully.");

            // Read from file
            String content = Files.readString(file);
            System.out.println("File content: " + content);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
