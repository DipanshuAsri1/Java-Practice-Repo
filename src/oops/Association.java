package oops;

public class Association {

    public static void main(String[] args) {

        class Student {
            private String name;
            public String getName() {
                return name;
            }
        }

        Student stud=new Student();
        stud.name="Deep";

        class Teacher {
            private String name;
            public void teach(Student student) {
                System.out.println("Teaching " + student.getName());
            }
        }

        Teacher teacher=new Teacher();
        teacher.teach(stud);

    }
}
