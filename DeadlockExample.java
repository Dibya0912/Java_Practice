public class DeadlockExample {
    private static final Object Lock1 = new Object();
    private static final Object Lock2 = new Object();
    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            synchronized (Lock1) {
                System.out.println("Thread1: Lock1");
                try { Thread.sleep(100); } catch (Exception ignored) {}
                synchronized (Lock2) { System.out.println("Thread1: Lock2"); }
            }
        });
        Thread t2 = new Thread(() -> {
            synchronized (Lock2) {
                System.out.println("Thread2: Lock2");
                try { Thread.sleep(100); } catch (Exception ignored) {}
                synchronized (Lock1) { System.out.println("Thread2: Lock1"); }
            }
        });
        t1.start(); t2.start();
    }
}
