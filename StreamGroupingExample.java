// StreamGroupingExample.java
import java.util.*;
import java.util.stream.*;

class Employee {
    String department;
    int salary;
    Employee(String department, int salary) {
        this.department = department;
        this.salary = salary;
    }
}

public class StreamGroupingExample {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("IT", 60000),
            new Employee("HR", 50000),
            new Employee("IT", 70000),
            new Employee("Finance", 55000),
            new Employee("HR", 65000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                e -> e.department,
                Collectors.averagingInt(e -> e.salary)
            ));

        avgSalaryByDept.forEach((dept, avg) ->
            System.out.println(dept + " -> Average Salary: " + avg));
    }
}
