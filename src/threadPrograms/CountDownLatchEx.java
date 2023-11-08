package threadPrograms;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CountDownLatchEx {

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService= Executors.newFixedThreadPool(4);
        CountDownLatch latch=new CountDownLatch(3);
        executorService.submit(new DepService(latch));
        executorService.submit(new DepService(latch));
        executorService.submit(new DepService(latch));
        latch.await(); // It waits until all the dependent service gets executed.
        // now main thread can proceed further
        executorService.shutdown();

    }

    public static class DepService implements Runnable{
    private CountDownLatch latch;

    public DepService(CountDownLatch latch) {this.latch=latch;}


        @Override
        public void run() {
             latch.countDown();
            System.out.println("Running........");
        }
    }
}

