// FileHandlingExample.java
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileHandlingExample2 {
    public static void main(String[] args) {
        try {
            File file = new File("example2.txt");
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
