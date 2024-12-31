package arraysProg;
/*
Input: arr[] = {2, 3, -8, 7, -1, 2, 3}
Output: 11
Explanation: The subarray {7, -1, 2, 3} has the largest sum 11.


Input: arr[] = {-2, -4}
Output: –2
Explanation: The subarray {-2} has the largest sum -2.


Input: arr[] = {5, 4, 1, 7, 8}
Output: 25
Explanation: The subarray {5, 4, 1, 7, 8} has the largest sum 25.
 */
public class MaximumSubArray {

    public static void main(String[] args) {

        int[] arr = {2, 3, -8, 7, -1, 2, 3};
       // System.out.println(maxSubarraySum(arr));
        System.out.println(maxSubarraySumKadanes(arr));
    }

    /*
    Naive approach
     */
    public static int maxSubarraySum(int arr[]){
        int res=arr[0];
        for(int i=0;i <arr.length;i++) {
            int currSum=0;
            for(int j=i;j<arr.length;j++){
                currSum=currSum+arr[j];
                res=Math.max(currSum,res);
            }
        }
        return res;
    }

    public static int maxSubarraySumKadanes(int arr[]) {


        int max_so_far=0; int max_ending_here=0;

        for(int i=0;i<arr.length;i++){
            max_ending_here=max_ending_here+arr[i];
            if(max_ending_here<0){
                max_ending_here=0;
            }
            if(max_so_far<max_ending_here){
                max_so_far=max_ending_here;
            }
        }
    return max_so_far;
    }
}
