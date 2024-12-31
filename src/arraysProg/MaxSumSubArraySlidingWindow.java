package arraysProg;

//Max sum subarray of size k
public class MaxSumSubArraySlidingWindow {

    public static void main(String[] args) {

        int arr[]={2,3,5,6,4,7,2};
        System.out.println("Hello");
            // window start - > i , end -> j , window size - ( j-i+1) as per indexing
          int i=0,j=0;
          int sum=0;
          int max=0;
          int k=3;
          while(j<arr.length) {
              sum+=arr[j];  //
              if((j-i+1) <k){          // you need to use if else if ( otherwise 1 run will be miscalculated)
                  j++;
              }
               else if((j-i+1)==k){
               //  do calc
                  max=Math.max(max,sum);
                  sum=sum-arr[i];
                  i++;
                  j++;
              }

          }
        System.out.println("Max"+max);
    }
}
