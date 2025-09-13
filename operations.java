import java.util.Scanner;

public class operations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();


        double sum = num1 + num2;

        double difference = num1 - num2;
  
        double product = num1 * num2;
     
        double quotient = 0;
        if (num2 != 0) {
            quotient = num1 / num2;
        } else {
            System.out.println("Division by zero is not allowed!");
        }

        System.out.println("Addition: " + sum);
        System.out.println("Subtraction: " + difference);
        System.out.println("Multiplication: " + product);
        if (num2 != 0) {
            System.out.println("Division: " + quotient);
        }

        scanner.close();
    }
}
