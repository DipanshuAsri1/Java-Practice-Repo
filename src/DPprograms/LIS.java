package DPprograms;

/**
 * Longest Increasing sequence ( find teh length)
 */
public class LIS {

    public static void main(String[] args) {

        int[] arr={43,22,9,31,21,50,41,60,80,1};
        //sample o/p should be 4
        System.out.println(findLis(arr));
    }

    private static int findLis(int[] arr) {
      int cnt=1;
      int max= arr[0];
      for(int i=1;i<arr.length;i++){
          if(arr[i]>max){
              cnt++;
          }
      }

        System.out.println("O/P is : "+cnt);

        return cnt;
    }
}
