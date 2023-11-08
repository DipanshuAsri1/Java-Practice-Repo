package recursion;

/**
 *  0 1 1 2 3 5 8 13
 */
public class Fibonacci {

    public static void main(String[] args) {

        System.out.println("Res :"+fun(7));
    }



    public static int fun(int n) {

        if(n==1)
            return 1;
        if(n==0)
            return 0;

        else return fun(n-1)+fun(n-2);
    }

    public int g(int x) {


            return 0;
    }
}
