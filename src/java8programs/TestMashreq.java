package java8programs;

import model.Employee;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestMashreq {

    public static void main(String[] args) {

        //name , dept , salary ( emp ) , List of emps ( filter > 50000 ) , group by dept , list as an output

        Employee emp1=new Employee();
        emp1.setName("Deep");
        emp1.setSalary(BigInteger.valueOf(2000000));
        emp1.setCity("Delhi");
        emp1.setAge(22);
        Employee emp2=new Employee();
        emp2.setName("Deepa");
        emp2.setSalary(BigInteger.valueOf(10000));
        emp2.setCity("Haryana");
        emp2.setAge(20);

        List<Employee> listEmp=new ArrayList<Employee>();
        listEmp.add(emp1);
        listEmp.add(emp2);

        Map<String,List<Employee>> map;
        map = listEmp.stream().filter(emp->emp.getSalary().intValue()>50000).collect(Collectors.groupingBy(Employee::getCity));
        map.forEach((x,v)-> System.out.println("Key is "+x+"Value"+ emp1.getSalary()));
        System.out.println(""+map);

     // List<Employee> sortedList= listEmp.stream().sorted(Comparator.comparing(Employee::getAge).thenComparing(Employee::getCity)).collect(Collectors.toList());

       // System.out.println(sortedList);

       // listEmp.stream().filter(emp->emp.getSalary().intValue()>5000).forEach(x-> System.out.println(x.getAge()));


    }
}
