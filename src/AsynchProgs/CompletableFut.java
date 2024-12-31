package AsynchProgs;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFut {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        // Run an asynchronous task
        CompletableFuture<Void> future = CompletableFuture.runAsync(() -> {
            // Simulate a long-running task
            System.out.println("Task running in: " + Thread.currentThread().getName());
            try {
                Thread.sleep(2000); // Simulate delay
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Task completed.");
        });


        future.exceptionally(ex -> {
            System.out.println("Handled Exception" + ex.getMessage());
            return null;
        });
        // Block and wait for the future to complete (for demonstration purposes)
        System.out.println("" + future.get()); // Avoid to use it
        // Use non-blocking methods like thenApply(), thenAccept(), or thenCombine() to handle the result when the future completes instead of calling get()


        ExecutorService executor = Executors.newFixedThreadPool(10);
        CompletableFuture.runAsync(() -> {
            // Long-running task
        }, executor);
        //By default, CompletableFuture.runAsync() and supplyAsync() use the common ForkJoinPool. If too many tasks are submitted, the pool can become exhausted, causing delays in executing tasks.

        CompletableFuture<String> future1 = CompletableFuture.supplyAsync(() -> "Hello");
        CompletableFuture<String> future2 = CompletableFuture.supplyAsync(() -> "Bye");


/*
CompletableFuture is best suited for short-lived, asynchronous tasks. For very long-running or resource-intensive tasks, it can lead to memory consumption issues or unresponsive threads.
Solution: For very long-running tasks, consider using a more robust framework like Akka, or manage long-lived tasks with specialized techniques, such as background workers or task queues
 */

/*
Summary of Best Practices:
1. Avoid blocking methods like get() or join() inside asynchronous code.
2. Always handle exceptions using exceptionally() or handle().
3. Use custom thread pools when necessary to avoid overloading the default ForkJoinPool.
4. For CPU-intensive tasks, use thenApplyAsync() instead of thenApply().
5. Keep asynchronous code readable by breaking tasks into smaller, manageable methods.
6. Carefully plan the concurrency model to avoid unintended parallelism or race conditions.
 */

    }
}

