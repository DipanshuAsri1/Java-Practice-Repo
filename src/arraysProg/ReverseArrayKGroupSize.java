package arraysProg;

import java.util.Arrays;

/**
 * i/p: int arr[] = {1,5,7,2,3,6,7,8,9} ,k=3
 * o/p: {7,5,1,6,3,2,9,8,7} , rev an array in groups of given size
 */
public class ReverseArrayKGroupSize {

    public static void main(String[] args) {
        int arr[] = {1,5,7,2,3,6,7,8,9} ;
        int len=arr.length;
        int k=3;

        for(int i=0;i <len;i=i+k){
            int end=Math.min(i+k-1,len-1);
            reverse(arr,i,end);
        }
        Arrays.stream(arr).forEach(s-> System.out.print(s+" "));
    }

    public static void reverse (int arr[], int start , int end ){

        while(start<end){
             int temp=arr[start];
             arr[start]=arr[end];
             arr[end]=temp;
             start++;
             end--;
        }
    }
}
