class ExceptionPropagationExample {
    void method1() {
        int data = 50 / 0; 
    }

    void method2() {
        method1();
    }

    void method3() {
        try {
            method2();
        } catch (Exception e) {
            System.out.println("Exception handled in method3: " + e);
        }
    }

    public static void main(String[] args) {
        ExceptionPropagationExample obj = new ExceptionPropagationExample();
        obj.method3();
        System.out.println("Program continues...");
    }
}
