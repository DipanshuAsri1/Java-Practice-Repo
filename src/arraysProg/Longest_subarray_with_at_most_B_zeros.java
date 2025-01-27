package arraysProg;

//The task is to find the length of the longest subarray where you can have all 1s by flipping at most B 0s.
//A = [1, 0, 1, 0, 1, 1, 0, 1, 0, 1]
public class Longest_subarray_with_at_most_B_zeros {

    public static int longestSubarrayWithAtMostBZeros(int[] A, int B) {
     int left=0;
     int maxLen=0;
     int zeroCount=0;

     for(int right=0;right<A.length;right++){

         if(A[right]==0)
             zeroCount++;

         while(zeroCount>B){

             if(A[left]==0){
                 zeroCount--;
             }
             left++;
         }
         maxLen=Math.max(maxLen,right-left+1);
     }

     return maxLen;
    }

    public static void main(String[] args) {
        int[] A = {1, 0, 1, 0, 1, 1, 0, 1, 0, 1};
        int B = 2;

        // Function call to find the result
        System.out.println(longestSubarrayWithAtMostBZeros(A, B)); // Output

    }
}
