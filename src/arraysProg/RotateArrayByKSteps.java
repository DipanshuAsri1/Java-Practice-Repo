package arraysProg;

import java.util.Arrays;

//rotate an array by K steps
public class RotateArrayByKSteps {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 8, 9, 10};
        int k = 3;

        for (int i = 0; i < k; i++) {
            rotate(arr);
        }
        Arrays.stream(arr).forEach(n -> System.out.print(" " + n));

    }

    public static void rotate(int[] arr) {

        int temp = arr[arr.length - 1];

        //shift other elements
        for (int j = arr.length - 1; j > 0; j--) {
            arr[j] = arr[j - 1];
        }
        arr[0] = temp;
    }
}
