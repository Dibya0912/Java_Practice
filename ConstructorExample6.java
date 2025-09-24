// ConstructorExample6.java
class Person {
    String name;
    int age;

    // Constructor 1
    Person() {
        this("Unknown", 0); // calling another constructor
    }

    // Constructor 2
    Person(String n, int a) {
        name = n;
        age = a;
    }

    void display() {
        System.out.println("Person: " + name + ", Age: " + age);
    }
}

public class ConstructorExample6 {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("John", 25);

        p1.display();
        p2.display();
    }
}
