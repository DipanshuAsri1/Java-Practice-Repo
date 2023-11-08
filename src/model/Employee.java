package model;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.Objects;

public class Employee implements Comparable<Employee> {
    private int age;
    private String name;

    private String city;

    private BigInteger salary;

    public Employee(){

    }
    public Employee(int age, String name, BigInteger salary , String city) {
        this.age = age;
        this.name = name;
        this.salary = salary;
        this.city=city;
    }

    public Employee(int age, String name, BigInteger salary  ){
        this.age = age;
        this.name = name;
        this.salary = salary;
    }
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigInteger getSalary() {
        return salary;
    }

    public void setSalary(BigInteger salary) {
        this.salary = salary;
    }

    @Override
    public int compareTo(Employee o) {
        if(age==o.getAge()){
            return (salary.intValue()-o.getSalary().intValue());
        }
        return age - o.getAge();

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name, salary);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                '}';
    }


}
