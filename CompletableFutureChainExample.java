import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executors;

public class CompletableFutureChainExample {

    public static void main(String[] args) {
        // Use a custom thread pool for demonstration
        var executor = Executors.newFixedThreadPool(2);

        // 1. Initial task: Supply a result asynchronously
        CompletableFuture<String> initialTask = CompletableFuture.supplyAsync(() -> {
            System.out.println("Step 1: Fetching user ID in " + Thread.currentThread().getName());
            return "user123";
        }, executor);

        // 2. Chain 1: Transform the result (user ID to data URL)
        CompletableFuture<String> dataUrlFuture = initialTask.thenApplyAsync(userId -> {
            System.out.println("Step 2: Generating URL in " + Thread.currentThread().getName());
            return "http://api.data.com/" + userId;
        }, executor);

        // 3. Chain 2: Process the final result (print it)
        dataUrlFuture.thenAccept(finalUrl -> {
            System.out.println("Step 3: Final data URL is " + finalUrl + " in " + Thread.currentThread().getName());
        });

        System.out.println("Main thread is not blocked.");
        
        // Wait for all tasks to complete (in a real app, you'd manage the ExecutorService better)
        executor.shutdown();
        while (!executor.isTerminated()) {
            // Wait for completion
        }
    }
}