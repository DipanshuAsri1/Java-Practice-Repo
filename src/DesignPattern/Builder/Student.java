package DesignPattern.Builder;


import java.util.List;

// inner static class can be used to create a builder design pattern ( via mkyong)
//object has to be massaged by some instructed steps before it is ready and can be used by others.
// you want some order
public class Student {

    private String name;
    private int age;
    private List<String> language;

    private Student(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.language = builder.language;
    }

    public static class Builder{

        private String name;
        private int age;
        private List<String> language;

        public Builder name(String name){
            this.name=name;
            return this;
        }

        public Builder age(int age){
            this.age=age;
            return this;
        }

        public Builder language(List<String> language){
         this.language=language;
         return this;
        }

        public Student build(){
            return new Student(this);
        }

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", language=" + language +
                '}';
    }



}


