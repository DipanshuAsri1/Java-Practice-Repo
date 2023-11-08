package threadPrograms;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class MyExecutor {


    public static void main(String[] args) throws ExecutionException, InterruptedException, TimeoutException {

        ExecutorService  executor=Executors.newSingleThreadExecutor();
        executor.submit(()->{
            String threadName=Thread.currentThread().getName();
            System.out.println("Hello"+threadName);
        });


        Future<String> future=executor.submit(new Work("Deep"));
        String s=future.get(10, TimeUnit.DAYS);
        System.out.println(":"+s+":");

        List list= Arrays.asList("Helli","Bye");


        list.forEach((n)->{
            System.out.println("Hello : "+n);
        });

    }
}
class  Work  implements  Callable<String>{

    private final String name;
    public Work(String name){
        this.name=name;
    }
    @Override
    public String call() throws Exception {
        return "Task Executed";
    }
}
