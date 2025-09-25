public class ThisExample3 {
    int num1, num2;

    ThisExample3(int num1, int num2) {
        this.num1 = num1; 
        this.num2 = num2; 
    }

    void display() {
        System.out.println("num1 = " + num1 + ", num2 = " + num2);
    }

    public static void main(String[] args) {
        ThisExample3 obj = new ThisExample3(30, 40);
        obj.display();
    }
    
}
