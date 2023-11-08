package recursion;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        fun(arr, 0, arr.length - 1);
        for (int x : arr) {
            System.out.println(x);
        }
    }

    public static void fun(int[] arr, int i, int j) {

        if (i >= j) {
            return;
        } else {
            swap(arr, i, j);
            fun(arr, ++i, --j);
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
