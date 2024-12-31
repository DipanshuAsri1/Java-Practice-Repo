package searchProgs;

public class BinarySearch {


    public static int binsearchRec(int[] arr , int l , int r , int elem){

        int mid=l+(r-1)/2;

        if(r>=1) {
            if (arr[mid] == elem) {
                return mid;
            } else if (arr[mid] > elem) {
                return binsearchRec(arr, l, mid - 1, elem);
            }
            return binsearchRec(arr, mid + 1, r, elem);
        }
        return -1;

    }
    public static void main(String[] args) {
        int arr[]={3,4,7,8,9,10};

        int start=0,mid=0,end=arr.length-1;


        int k=4;
        while(start<=end){
            mid=(start+end)/2;
            if(arr[mid]==k) {
                System.out.println("found : " + k + " at pos : " + (mid+1));
                break;
            }
            else if ( k < arr[mid]){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }


        System.out.println("Index: "+binsearchRec(arr,start,end,9));
    }
}
