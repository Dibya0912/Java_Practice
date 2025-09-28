class Student {
    private String name;  // private field


    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }
}

public class EncapsulationExample1 {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("Dibya");  // setting value
        System.out.println("Student Name: " + s.getName());  // getting value
    }
}
