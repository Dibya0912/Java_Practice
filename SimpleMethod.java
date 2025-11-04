public class SimpleMethod {

    // main method: entry point of the program
    public static void main(String[] args) {
        // Call the custom method
        greetUser("Alice");
        greetUser("Bob");
    }

    /**
     * A simple method that takes a String parameter and prints a greeting.
     */
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "! Welcome.");
    }
}