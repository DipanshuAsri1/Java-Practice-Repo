package arraysProg;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.PriorityQueue;

public class KLargestElem {




    //using sorting
    // o(n*(logn)
    public static int kLargest(Integer[] arr, int n, int k) {
        // sort in desc
        Arrays.sort(arr,Collections.reverseOrder());
        // Print the first kth largest elements

        System.out.println("Larg"+arr[k-1]+"Small"+arr[n-k]);
        return arr[k-1];
        //print Kth smallest then return [n-k]

        //if you sort in asc then return arr[n-k]

    }
    //using priority queue
    //o(n*log(k))
    public static void kLargestMinHeap(int a[], int n, int k)
    {
        // Impl using a priority queue
        PriorityQueue<Integer> pq=new PriorityQueue<Integer>();
        PriorityQueue<Integer> pq1=new PriorityQueue<Integer>(n,new MyComparator());


       for(int i=0;i<n;i++){
           pq.add(a[i]);

           if(pq.size()>k){
               pq.poll();
           }
       }

       while(!pq.isEmpty()){
           System.out.println(pq.peek()+" ");
           pq.poll();
       }
        System.out.println();
    }

    public static void main(String[] args) {

        Integer arr[]= {12,5,787,1,23};
        int ar[]= {12,5,787,1,23};
        int n=5;
        int k=2;
        System.out.println("Kth Largest"+kLargest(arr,n,k));
        //kLargestMinHeap(ar,n,k);


        //create max heap comparator


    }




}
