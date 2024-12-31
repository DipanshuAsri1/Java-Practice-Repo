package arraysProg;

public class FindTwoMissingNumber {

    //approach 2
    public static void findTwoMissingNumbers(int arr[], int n){
        boolean[] mark=new boolean[n+1]; // extra space o(n)

        //first mark all the elems which are present in array
        for(int i=0;i<n-2;i++){
            mark[arr[i]]=true;
        }

        for(int i=1;i<n;i++){
            if(!mark[i]){ // print which are all false
                System.out.println(""+i+"");
            }
        }


    }

    public static void main(String[] args) {



        int[] arr = {3, 2, 6, 1, 8, 9, 7};

        int N = 9;
        //approach 2
        findTwoMissingNumbers(arr,N);

        //approach 1
        // first find the sum from 1 To N
        int originalSum = N * (N + 1) / 2;
        int partialSum = 0;
        for (int i = 0; i < arr.length; i++) {
            partialSum += arr[i];
        }
        int leftSum = originalSum - partialSum;
        int x1, x2;
        x1 = x2 = 0;

        // x1+x2=originalSum-partialSum;
        System.out.println(originalSum);

        for (int i = 1, j = arr.length; i < j; ) {
            if (i + j == leftSum) {
                System.out.println(i + "," + j);
                i++;
                j--;
            } else if ((i + j) > leftSum) {
                j--;
            } else {
                i++;
            }
        }
    }
}
