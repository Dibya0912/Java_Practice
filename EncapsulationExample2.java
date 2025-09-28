class Employee {
    private int id;
    private String position;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getPosition() {
        return position;
    }
    public void setPosition(String position) {
        this.position = position;
    }
}

public class EncapsulationExample2 {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setId(101);
        e.setPosition("Manager");

        System.out.println("Employee ID: " + e.getId());
        System.out.println("Employee Position: " + e.getPosition());
    }
}
