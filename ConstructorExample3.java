
class Employee {
    String name;
    int id;

    Employee() {
        name = "Not Assigned";
        id = 0;
    }
    Employee(String n, int i) {
        name = n;
        id = i;
    }

    void display() {
        System.out.println("Employee: " + name + ", ID: " + id);
    }
}

public class ConstructorExample3 {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        Employee e2 = new Employee("Alice", 101);

        e1.display();
        e2.display();
    }
}
