import java.io.File;

public class FileDeleteExample {
    public static void main(String[] args) {
        File file = new File("sample.txt");

        if (file.delete()) {
            System.out.println(file.getName() + " deleted successfully.");
        } else {
            System.out.println("File deletion failed or file not found.");
        }
    }
}
