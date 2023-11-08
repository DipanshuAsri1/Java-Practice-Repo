package recursion;

public class PrintLinear1ToN {

    public static void main(String[] args) {

        fun(1,4);
         reverseOrder(4);
    }

    /**
     * linear
     * @param i
     * @param n
     */
    public static void fun(int i ,int n) {

        if(i>n) return;
        System.out.println(i);
        fun(i+1,n);

    }

    public static void reverseOrder(int n) {

        if(n==0) return;

        System.out.println(n);
        reverseOrder(--n);
    }

}
