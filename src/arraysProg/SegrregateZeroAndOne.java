package arraysProg;


import java.util.Arrays;

public class SegrregateZeroAndOne {
    public static void main(String[] args) {

        int arr[]={0,1,0,1,0,0,0,1,0};
        int j=0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]==0)
            arr[j++]=arr[i] ;
        }
        while(j<arr.length){
            arr[j++]=1;
        }
        Arrays.stream(arr).forEach(s-> System.out.println(s));
    }
}
