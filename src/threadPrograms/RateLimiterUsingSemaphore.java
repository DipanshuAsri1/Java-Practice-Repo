package threadPrograms;

import java.util.concurrent.Semaphore;

public class RateLimiterUsingSemaphore {

  private Semaphore semaphore=new Semaphore(3);

  public void handleRequest(String reqName){
      try{
          System.out.println(reqName+" waiting to acquire");
          semaphore.acquire();
          System.out.println(reqName+ " acquired a permit");
          Thread.sleep(2000);
          System.out.println(reqName+" has finished processing");
      }catch(Exception ex){
          ex.printStackTrace();

      }finally{
          System.out.println(reqName+ "is releasing a permit.");
          semaphore.release();
      }

  }

    public static void main(String[] args) {

      RateLimiterUsingSemaphore rateLimiterUsingSemaphore=new RateLimiterUsingSemaphore();
      for(int i=0;i<=6;i++){
          String reqName="API request:"+i;
          new Thread(()->rateLimiterUsingSemaphore.handleRequest(reqName)).start();
      }
    }
}
