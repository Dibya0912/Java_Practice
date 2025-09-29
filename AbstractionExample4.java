interface Printer {
    void print();
}

interface Scanner {
    void scan();
}

class AllInOnePrinter implements Printer, Scanner {
    public void print() {
        System.out.println("Printing document...");
    }
    public void scan() {
        System.out.println("Scanning document...");
    }
}

public class AbstractionExample4 {
    public static void main(String[] args) {
        AllInOnePrinter device = new AllInOnePrinter();
        device.print();
        device.scan();
    }
}
