import java.util.Scanner;  

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        int number = 0;
        boolean isValid = false;

        while (!isValid) {
            System.out.print("Enter a whole number: ");

            if (scanner.hasNextInt()) { 
                number = scanner.nextInt();
                isValid = true;
            } else {
                System.out.println("Invalid input. Please enter a valid number.");
                scanner.next();  
            }
        }

        System.out.println("You entered the number: " + number);
        scanner.close(); 
    }
}
