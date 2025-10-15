class Parent {
    Parent() {
        System.out.println("Parent class constructor called");
    }
}

class ConstructorChainingExample extends Parent {
    ConstructorChainingExample() {
        this(10);
        System.out.println("Default constructor called");
    }

    ConstructorChainingExample(int x) {
        System.out.println("Parameterized constructor called with value: " + x);
    }

    public static void main(String[] args) {
        new ConstructorChainingExample();
    }
}
