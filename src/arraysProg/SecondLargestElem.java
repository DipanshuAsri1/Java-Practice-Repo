package arraysProg;

import java.util.Arrays;
import java.util.Collections;

public class SecondLargestElem {

    public static void main(String[] args) {

        int arr[] = {1, 2};
        System.out.println("Second " + Arrays.stream(arr).sorted().skip(arr.length - 2).findFirst().getAsInt());
        Arrays.asList(arr).stream().sorted(Collections.reverseOrder()).forEach(s -> System.out.println(s.toString()));
        //Collections.sort();

        //2nd approach ( n*lgn)
        int arr1[] = {3, 2, 1, 56, 2, 1, 4, 7, 7};

        Arrays.sort(arr1);
        int n = arr1.length;
        int largest = arr1[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            int sec = arr1[i];
            System.out.println("Sec Largest : " + sec);
            break;
        }

        // two pointer
        int arr2[] = {3, 2, 1, 56, 2, 1, 4, 7, 7};
        int max1 = arr1[0];
       int max2=-1;

       //ist pass
       for(int i=1;i<n-1;i++){
           if(arr2[1]>max1){
               max1=arr2[1];

           }
       }
       //2nd pass
        for(int j=0;j<n;j++){
            if(max2>arr2[j] && arr2[j]!=max1){
                max2=arr2[j];
            }
        }//o(2N)

        //best one

         max1 = arr2[0];
         max2=-1;
        for(int j=1;j<n;j++){
            if(max1<arr2[j] ){
                max2=max1;
                max1=arr2[j];
            }
            else if (arr2[j]< max1 && arr2[j]>max2){
                max2=arr2[j];
            }

        }
        System.out.println("max2 : "+max2+" Max1 "+max1);


    }

}