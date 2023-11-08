package recursion;

public class PrintNameNtimes {
    public static void main(String[] args) {

        fun(5);
    }

    public static void fun(int n){
        if(n==0) return;
        System.out.println("Deep");
        fun(--n);
    }
}
