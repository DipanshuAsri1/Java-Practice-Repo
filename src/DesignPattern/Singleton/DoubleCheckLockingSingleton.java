package DesignPattern.Singleton;

public class DoubleCheckLockingSingleton {

    private static volatile DoubleCheckLockingSingleton instance;

    private DoubleCheckLockingSingleton(){

    }

    private static DoubleCheckLockingSingleton getInstance(){
        if(instance==null){
            synchronized (DoubleCheckLockingSingleton.class){
                if(instance==null){
                    instance=new DoubleCheckLockingSingleton();
                }
            }
        }
        return instance;
    }

    public void displayMessage(){
        System.out.println("Singleton Instance:"+this);
    }

    public static void main(String[] args) {

        Runnable task=() ->{
             DoubleCheckLockingSingleton singleton=DoubleCheckLockingSingleton.getInstance();
             singleton.displayMessage();
        };

        Thread thread1=new Thread(task);
        Thread thread2=new Thread(task);
        Thread thread3=new Thread(task);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
