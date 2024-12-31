package DesignPattern.Builder;

import java.util.Arrays;

public class TestStudent {
    public static void main(String[] args) {

        Student stud=new Student.Builder().age(23).name("Deep").language(Arrays.asList("Hindi","English")).build();

        System.out.println(stud);
    }
}
