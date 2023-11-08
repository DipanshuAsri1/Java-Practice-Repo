package arraysProg;

import java.util.Arrays;

/**
 * i/p: int arr[] = {0,1,1,0,1,2,0,1,2}
 * o/p int arr[]={0,0,0,1,1,1,1,2,2}
 */
public class SortArrayZeroOneTows {

    public static void main(String[] args) {
        int arr[] = {0, 1, 1, 0, 1, 2, 0, 1, 2};
        //approach 1
        Arrays.sort(arr);

        //appraoch 2
        //try to solve it stat , mid and high pointer approach

        int start = 0, mid = 0, high = 0;


        for (int x : arr) {
            System.out.print(x + " ");
        }
    }
}
