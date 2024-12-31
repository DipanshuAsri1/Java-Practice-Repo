package threadPrograms;

import java.util.concurrent.Semaphore;

public class SemaphoreExample {

    public static void main(String[] args) {
        // Create a semaphore with 3 permits
        Semaphore semaphore = new Semaphore(3);

        // Create multiple threads that try to acquire the semaphore
        for (int i = 1; i <= 5; i++) {
            new Worker(semaphore, "Worker-" + i).start();
        }
    }
}

class Worker extends Thread {
    private Semaphore semaphore;
    private String workerName;

    public Worker(Semaphore semaphore, String workerName) {
        this.semaphore = semaphore;
        this.workerName = workerName;
    }

    @Override
    public void run() {
        try {
            System.out.println(workerName + " is trying to acquire a permit...");
            semaphore.acquire();  // Acquire a permit
            System.out.println(workerName + " acquired a permit!");

            // Simulate some work with sleep
            Thread.sleep(2000);

        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            System.out.println(workerName + " has released a permit.");
            semaphore.release();  // Release the permit
        }
    }
}

