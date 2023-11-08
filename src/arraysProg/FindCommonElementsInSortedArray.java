package arraysProg;

import java.util.HashSet;

// arr1 []={1,5,10,20,30,40,100}
// arr2 []={6,7,20,80,100}
// arr3 []={3,4,20,70,100}
public class FindCommonElementsInSortedArray {
    public static void main(String[] args) {

        // Beginners : time O ( n*3 )

        //2nd approach ( find the elems which are common in 1st and 2nd arr )

        //3rd approach
        // https://www.geeksforgeeks.org/find-common-elements-three-sorted-arrays/

        int arr1[] = {1, 5, 10, 20, 30, 40, 100};
        int arr2[] = {6, 7, 20, 80, 100};
        int arr3[] = {3, 4, 20, 70, 100};

        HashSet set1 = new HashSet();
        HashSet set2 = new HashSet();
        HashSet set3 = new HashSet();


        for (int i = 0; i <arr1.length;i++){
            set1.add(arr1[i]);
        }
        for (int i = 0; i <arr2.length;i++){
            set2.add(arr2[i]);
        }

        for (int i = 0; i <arr3.length;i++){
            if(set1.contains(arr3[i]) && set2.contains(arr2[i])){
                if(!set3.contains(arr3[i])){
                    System.out.println(""+arr3[i]);
                }
                set3.add(arr3[i]);
            }
        }


    }
}
