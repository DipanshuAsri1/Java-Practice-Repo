package arraysProg;

import java.util.Arrays;

//to remove inplace sorted array
public class RemoveInPlaceDuplicate {

//2 pointer approach
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,5,5};
        int i=0;
        for(int j=1;j<arr.length;j++){
            if(arr[j]!=arr[i]){
                arr[i+1]=arr[j];
                i++;
            }
        }

        for(int j=0;j<(i+1);j++){
            System.out.println("Val is "+arr[j]);
        }
    }
}
