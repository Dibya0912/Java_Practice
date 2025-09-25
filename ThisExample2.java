public class ThisExample2 {
    int a, b;

    ThisExample2(int a, int b) {
        this.a = a; 
        this.b = b; 
    }

    void display() {
        System.out.println("a = " + a + ", b = " + b);
    }

    public static void main(String[] args) {
        ThisExample2 obj = new ThisExample2(10, 20);
        obj.display();
    }
    
}
