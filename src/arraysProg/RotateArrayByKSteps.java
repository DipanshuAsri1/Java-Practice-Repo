package arraysProg;

import java.util.Arrays;

//rotate an array by K steps
public class RotateArrayByKSteps {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 8, 9, 10};
        int k = 3;

        for (int i = 0; i < k; i++) {
            // rotate(arr);
            // This will be a costly operation as it will shift element every time for single rotation
        }
        //Arrays.stream(arr).forEach(n -> System.out.print(" " + n));

        //2nd Method
        RightRotate(arr,arr.length,k);

    }

    public static void rotate(int[] arr) {

        int temp = arr[arr.length - 1];

        //shift other elements
        for (int j = arr.length - 1; j > 0; j--) {
            arr[j] = arr[j - 1];
        }
        arr[0] = temp;
    }

    /**
     *
     * @param a
     * @param n
     * @param k
     */
    public static void RightRotate(int a[],
                            int n, int k)
    {

        // If rotation is greater
        // than size of array
        k=k%n;

        for(int i = 0; i < n; i++)
        {
            if(i<k)
            {
                // Printing rightmost
                // kth elements
                System.out.print(a[n + i - k]
                        + " ");
            }
            else
            {
                // Prints array after
                // 'k' elements
                System.out.print(a[i - k]
                        + " ");
            }
        }
        System.out.println();
    }
}
