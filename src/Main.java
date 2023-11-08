import model.Employee;

import java.math.BigInteger;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        double x=100330001;
        System.out.println("Hello world!"+x);

        Employee emp=new Employee();

        emp.setAge(12);
        emp.setName("Deep");
        emp.setSalary(BigInteger.valueOf(400000000));

        Employee emp2=emp; // call by ref

        //Employee emp2=new Employee();

        emp2.setAge(12);
        emp2.setName("Deep");
        emp2.setSalary(BigInteger.valueOf(40000));

       //Every new object has a different hashcode.
        System.out.println("Val is "+emp+" : hashcode : 1 "+emp.hashCode() + "hashcode: 2 "+emp2.hashCode());

        String[] array={"TCS","JIka","hola",null};

        Arrays.stream(array).forEach(y-> Optional.ofNullable(y).ifPresent(System.out::println));


        List<Employee> list=new ArrayList<>();
        list.add(new Employee(1,"Deep",BigInteger.valueOf(3499)));
        list.add(new Employee(5,"Deepak",BigInteger.valueOf(1499)));
        list.add(new Employee(3,"Beepakak",BigInteger.valueOf(199)));

        ArrayList<Employee> myList= (ArrayList<Employee>) list.stream().sorted(Comparator.comparing(Employee::getAge)).collect(Collectors.toList());
        myList.forEach(s-> System.out.println(s.getAge()+":"+s.getSalary()));

        List<Employee> list2=new ArrayList<>();
        list2.add(new Employee(1,"Deep",BigInteger.valueOf(3499),"Delhi"));
        list2.add(new Employee(2,"Deep",BigInteger.valueOf(13499),"Delhi"));
        list2.add(new Employee(1,"Deepak",BigInteger.valueOf(31499),"Nagpur"));
        list2.add(new Employee(1,"Deepu",BigInteger.valueOf(3419),"Goa"));
        list2.add(new Employee(1,"Dpak",BigInteger.valueOf(2499),"Goa"));
        //list2.stream().collect(Collectors.groupingBy(Employee::getCity,Collectors.collectingAndThen(Collectors.maxBy(Employee::getSalary)),Optional::get)));


        // employee max salary for each city
        list2.stream()
        .collect(Collectors.groupingBy(
                Employee::getCity,
                Collectors.collectingAndThen(Collectors.maxBy(Comparator.comparingInt(p->p.getSalary().intValue())), Optional::get)
        )).forEach((l,m)-> System.out.println(l+":"+m));

        LocalDate ld= LocalDate.now();
        LocalDate ld2= LocalDate.of(2022,12,29);
        LocalDateTime ldt=LocalDateTime.now();
        ZoneId zid=ZoneId.of("US/Pacific");
        System.out.println("Val is ");
        System.out.println("Check :"+ld2.isBefore(ld));
        Clock clock=Clock.systemDefaultZone();
        System.out.println("clock: "+clock.instant());



    }
}