package lambdaExpression;

import model.Employee;

import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class LambdaEx {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList();
        list.add(1);
        list.add(2);

        list.forEach(x->{
            System.out.println(x);
        });

        InterEx interEx=(s)-> "Hello";
        System.out.println(interEx.method(7));
        interEx.hel();
        list.stream().filter(x->x%2==0).collect(Collectors.toList());

        ArrayList<Employee> empList=new ArrayList<Employee>();
        empList.add(new Employee(1,"Deep",BigInteger.valueOf(6000000)));
        empList.add(new Employee(4,"Deepa",BigInteger.valueOf(600)));
        empList.add(new Employee(12,"Deepak",BigInteger.valueOf(1600)));

        Set hs=new HashSet();

        Optional<Employee> emp=empList.stream().max(Comparator.comparing(Employee::getSalary));
        if(emp.isPresent()){
            System.out.println(emp.get().getSalary());
        }

    }


}

interface InterEx{
    String method(int x);
    default  void hel(){
        System.out.println("Its ok ");
    }
}