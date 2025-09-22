public class StringBuilderExample2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");  
        sb.delete(4, 16);           
        sb.insert(0, "Learn ");     
        sb.reverse();              

        System.out.println("StringBuilder result: " + sb);
    }
}
