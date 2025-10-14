interface Printable {
    void print();
}

interface Showable {
    void show();
}

public class InterfaceMultipleInheritance implements Printable, Showable {
    public void print() {
        System.out.println("Printing...");
    }
    public void show() {
        System.out.println("Showing...");
    }

    public static void main(String[] args) {
        InterfaceMultipleInheritance obj = new InterfaceMultipleInheritance();
        obj.print();
        obj.show();
    }
}
