public class StringBufferExample {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Hello");

        sb.append(" World");    
        sb.insert(5, ",");        
        sb.replace(0, 5, "Hi");   
        sb.reverse();             

        System.out.println("StringBuffer result: " + sb);
    }
}
