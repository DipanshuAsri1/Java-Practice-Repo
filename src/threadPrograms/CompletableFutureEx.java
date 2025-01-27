package threadPrograms;


import java.util.Locale;
import java.util.concurrent.CompletableFuture;

public class CompletableFutureEx {

    public static void main(String[] args) throws InterruptedException {

       CompletableFuture<String> future= CompletableFuture.supplyAsync(()-> {

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
           return "Task Completed";
       });

       future.thenApply(result->{
           System.out.println("Processed Result : "+result);
           return result.toUpperCase();
       });



        System.out.println("Doing some other work");

        Thread.sleep(3000);
    }
}
