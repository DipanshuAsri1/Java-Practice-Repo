package threadPrograms;

import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Suppose in a game i want to send a message/to start a game when all the 3 players have arrived time.
 * So we make a barrier and every player wait for others until all 3 player comes ( together )
 */
public class CyclicBarrierEx {

    public static void main(String[] args) {

        ExecutorService service= Executors.newFixedThreadPool(4);
        CyclicBarrier barrier=new CyclicBarrier(3);

        service.submit(new Task(barrier));
        service.submit(new Task(barrier));
        service.submit(new Task(barrier));
    }

    public static class Task implements Runnable{
        private CyclicBarrier barrier;
        public Task(CyclicBarrier barrier){
            this.barrier=barrier;
        }

        @Override
        public void run(){

            while(true){
                try {
                    barrier.await();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                } catch (BrokenBarrierException e) {
                    throw new RuntimeException(e);
                }
            }

        }
    }


}
