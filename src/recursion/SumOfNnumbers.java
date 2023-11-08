package recursion;

public class SumOfNnumbers {

    public static void main(String[] args) {

        System.out.println(fun(3));
           fun2(3,0);
    }

    /**
     * functional way
     * @param n
     */
    public static int fun(int n) {

        if (n == 0)
            return n;

        return n + fun(--n);
    }

    /**
     * parametrized way
     */
    public static void fun2(int n, int sum) {

        if (n <1) {
            System.out.print(sum);
            return;
        }
          fun2(n--,sum+n);
    }
}
