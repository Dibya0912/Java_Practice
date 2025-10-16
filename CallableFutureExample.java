import java.util.concurrent.*;

public class CallableFutureExample {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newSingleThreadExecutor();
        Future<Integer> future = service.submit(() -> {
            Thread.sleep(500);
            return 10 + 20;
        });
        System.out.println("Result: " + future.get());
        service.shutdown();
    }
}
