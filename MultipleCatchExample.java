public class MultipleCatchExample {
    public static void main(String[] args) {
        try {
            String s = "123a";
            int num = Integer.parseInt(s);
            int arr[] = {10, 20};
            System.out.println(arr[3]);    
        } catch (NumberFormatException e) {
            System.out.println("Handled NumberFormatException: " + e);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Handled ArrayIndexOutOfBoundsException: " + e);
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e);
        }
    }
}
