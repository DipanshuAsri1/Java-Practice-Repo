package streams;

import model.Employee;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmpComparator {

    public static void main(String[] args) throws InterruptedException {

        List<Employee> empList=new ArrayList<Employee>();

        empList.add(new Employee(13,"Deep", BigInteger.valueOf(230000)));
        empList.add(new Employee(1,"Deep", BigInteger.valueOf(130000)));
        empList.add(new Employee(11,"Deep", BigInteger.valueOf(240000)));

       Thread.yield();

       Thread t1=new Thread(()->{
           for(int i=0;i<5;i++){
           System.out.println("Thread t1 running:"+i);
           Thread.yield();
       }});
        Thread t2=new Thread(()->{
            for(int i=0;i<5;i++){
                System.out.println("Thread t2 running:"+i);
                Thread.yield();
            }});
       t1.start();
       t1.join(); // it will make t1 to complete its execution
       t2.start();

        List<Employee> sortedEmployee=empList.stream().sorted(Comparator.comparing(Employee::getName).thenComparing(Employee::getSalary)).collect(Collectors.toList());
        sortedEmployee.forEach(System.out::println);
    }


}
