public class Test1 {

    public static void main(String[] args) {

        // list of employees //sort by name // if name are same then sort by id

        List<Employee> employeeList=new ArrayList<Employee>();

        employeeList.stream().sorted(Comparator.comparing(Employee::getName)).sorted(Comparator.comparing(Employee::getId)).collect




                public int compare(Employee obj1 ){

            if(!obj1 isInstanceOf Employee){
                return ;
            }
            else{

                if(!this.getEmpName().equals(obj1.getEmpName())){

                    return this.getId()-obj1.Id();
                }else{

                    return obj1-obj2;
                }

            }

//abc - > s1 , s2
// abc - > s3



            Map<String, Integer> map = new HashMap<String, Integer>();
            String s1 =  "abc";
            map.put(s1,1);  // abc , 1

            String s2 =  "abc";
            map.put(s2,2);  // abc , 2

            String s3 = new String("abc");
            map.get(s3);   //  null or some error

            s2.equals(s3) // true
            s2==s3  // false

            hashcode(s2) / hashcode(s3)


        }


        class Employee<T>{

            public T hello( T val){
                System.out.println("HI");
            }

            public void test(){


            }

        }


        Employee<Integer> obj=new Employee<T>();
        obj.hello();


        @ControllerAdvice
         class MyAdvice{

            
            public void throwThis(){


            }

        }
    }
}
