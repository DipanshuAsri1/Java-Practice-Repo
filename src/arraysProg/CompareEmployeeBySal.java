package arraysProg;

import model.Employee;

import java.math.BigInteger;
import java.util.Arrays;

public class CompareEmployeeBySal {

    public static void main(String[] args) {

//        Employee emp1=new Employee(23,"Deep", BigInteger.valueOf(3000));
//        Employee emp2=new Employee(23,"Deep", BigInteger.valueOf(4000));
//        Employee emp3=new Employee(23,"Deep", BigInteger.valueOf(5000));


        Employee [] employees=new Employee[4];



        for(int i=0;i<4;i++) {
            employees[i]= new Employee(20 +i, "Deep", BigInteger.valueOf(3000 - i));
        }

            Arrays.sort(employees);
        System.out.println(Arrays.toString(employees));


    }



}
