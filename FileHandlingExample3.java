// FileHandlingExample.java
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample3 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example2.txt", true);
            writer.write("\nThis line is appended to the file.");
            writer.close();
            System.out.println("Successfully appended to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
