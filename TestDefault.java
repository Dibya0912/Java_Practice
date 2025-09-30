class DefaultClass {   // package-private
    void show() {
        System.out.println("This is a default (package-private) class method.");
    }
}

public class TestDefault {
    public static void main(String[] args) {
        DefaultClass obj = new DefaultClass();
        obj.show();
    }
}
