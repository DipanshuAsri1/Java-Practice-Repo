package arraysProg;

import java.util.HashSet;

//3 sum problem
public class TripletsWithZeroSum {
    // find all unique triplets which give the sum of zero
    // they must not have duplicate triplets


    public static void main(String[] args) {
        // brute force ( 3 loops ) // So think of 2nd approach
        int arr[] = {-1, 0, 1, 2, -1, -4}; // sorted ( -4,-1,-1,0,1,2)
        int sum = 0;


        //This one is o(n*n) but will have duplicate triplets
        boolean f = false;

        for (int i = 0; i < arr.length - 1; i++) {
            HashSet set = new HashSet();
            for (int j = i + 1; j < arr.length; j++) {
                int x = -(arr[i] + arr[j]);
                if (set.contains(x)) {
                    System.out.println(x + ":" + arr[i] + ":" + arr[j]);
                    f = true;
                }else{
                    set.add(arr[j]);
                }
            }
        }
            // Third approach

    }

}
