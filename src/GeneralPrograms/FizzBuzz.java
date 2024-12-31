package GeneralPrograms;

//Print numbers from 1 to N, replacing multiples of 3 with "Fizz",
// multiples of 5 with "Buzz", and multiples of both with "FizzBuzz".
public class FizzBuzz {

    public static void main(String[] args) {

        int n=6;

        for(int i=1;i<n;i++){

            if(i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            } else if (i%5==0){
                System.out.println("Buzz");
            }else if (i%3==0){
                System.out.println("Fizz");
            }else{
                System.out.println(i);
            }
        }

    }
}
