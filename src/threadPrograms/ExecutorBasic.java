package threadPrograms;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class TaskHandler implements Runnable{

    private String taskName;

    @Override
    public void run() {

        System.out.println("Task assigned - > Thread is running "+Thread.currentThread().getName()+"");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Task is "+taskName+"completed by thread"+Thread.currentThread().getName()+" : state"+Thread.currentThread().getState());

    }

    public TaskHandler(String task){
        this.taskName=task;
        System.out.println("Task is "+task);
    }
}

public class ExecutorBasic {

    public static void main(String[] args) {

        TaskHandler taskHandler =new TaskHandler("Task 1 ");

        ExecutorService executorService=Executors.newFixedThreadPool(4);
        executorService.submit(taskHandler);
        executorService.shutdown();
    }
}
