// FileHandlingExample.java
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample1 {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example2.txt");
            writer.write("Hello, this is a file handling example in Java.");
            writer.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
