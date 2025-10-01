public class FinallyExample {
    public static void main(String[] args) {
        try {
            int result = 10 / 2;
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception caught: " + e);
        } finally {
            System.out.println("Finally block always executes!");
        }
    }
}
