package GeneralPrograms;

/**
 *
 */
public class Fibonacci {

    public static void main(String[] args) {

     //   System.out.println(n1+""+n2);
      //  printFibonacciSeries(6);
        printFibonacciSeriesIter(6);
    }

    static int n1=0, n2=1,n3=0;
    private static void printFibonacciSeries(int count) {

        if(count>1){
            n3=n1+n2;
            n1=n2;
            n2=n3;
            System.out.println(n3);
            printFibonacciSeries(count-1);
        }
    }

    private static void printFibonacciSeriesIter(int count) {
       //0 1 1 2 3 5
        n1=0;
        n2=1;
        System.out.print(n1+" "+n2);
        for(int i=0; i<count-2;i++){

            n3=n1+n2;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }

}
