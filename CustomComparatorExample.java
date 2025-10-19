import java.util.*;

class Employee {
    String name;
    int salary;
    Employee(String name, int salary) { this.name = name; this.salary = salary; }
    public String toString() { return name + " - " + salary; }
}

public class CustomComparatorExample {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
            new Employee("Ashish", 50000),
            new Employee("Sai", 70000),
            new Employee("Subham", 60000)
        );

        employees.sort(Comparator.comparingInt(e -> e.salary));
        System.out.println("Sorted by Salary: " + employees);

        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println("Sorted by Name: " + employees);
    }
}
