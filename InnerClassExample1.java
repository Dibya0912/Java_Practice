class Outer {
    void showOuter() {
        System.out.println("Inside Outer class");
    }

    class Inner {
        void showInner() {
            System.out.println("Inside Inner class");
        }
    }
}

public class InnerClassExample1 {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.showOuter();

        Outer.Inner i = o.new Inner(); // create inner class object
        i.showInner();
    }
}
