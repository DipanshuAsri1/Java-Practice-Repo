package threadPrograms;

class MyThread extends Thread{

    @Override
    public void start(){
        System.out.println("Hello........from thread "+Thread.currentThread().getName());
    }
}

public class SimpleThreads {


    public static void main(String[] args) {

        MyThread thread1=new MyThread();
        MyThread thread2=new MyThread();

        thread1.start();
        thread2.start();
    }
}




