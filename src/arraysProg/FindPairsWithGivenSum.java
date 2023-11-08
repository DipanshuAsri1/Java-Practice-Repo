package arraysProg;

//arr[]={1,2,3,4,5,6,7}
//sum=9
//elems are distinct and in sorted order
public class FindPairsWithGivenSum {
    public static void main(String[] args) {

        //approach 1  ( Brute force )
        int arr[]={1,2,3,4,5,6,7};
        int sum=9;
        for(int i=0;i<arr.length-1;i++){
            for(int j=i+1;j<arr.length && j!=i;j++){
                if(sum==(arr[i]+arr[j])){
                    System.out.println("Pair : "+arr[i]+","+arr[j]);
                }
            }
        }
        //approach 2
        //elems are in distinct order so you can use low and high pointers

        System.out.println("---------Approach 2---------------");
        int low=0;
        int high=arr.length-1;
        while(low<high){

            if (arr[low]+arr[high]<sum) {
                low++;
            } else if (arr[low]+arr[high]>sum ) {
                high--;
            }else if(arr[low]+arr[high]==sum){
                System.out.println("Pair is "+arr[low]+","+arr[high]);
                low++;
                high--;
            }
        }
    }
}
