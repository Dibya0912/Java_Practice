public class MultithreadingExample2 extends Thread {
    public void run() {
        for (int i = 1; i <= 5; i++) {
            System.out.println(Thread.currentThread().getName() + " - Count: " + i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
        }
    }

    public static void main(String[] args) {
        MultithreadingExample2 t1 = new MultithreadingExample2();
        MultithreadingExample2 t2 = new MultithreadingExample2();
        t1.setName("Thread-A");
        t2.setName("Thread-B");
        t1.start();
        t2.start();
    }
}
