
import java.util.*;

class WildcardDemo {
    public static void printList(List<?> list) {
        for (Object obj : list) {
            System.out.print(obj + " ");
        }
        System.out.println();
    }
}

public class GenericsExample5 {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 3);
        List<String> strList = Arrays.asList("A", "B", "C");

        WildcardDemo.printList(intList);
        WildcardDemo.printList(strList);
    }
}
