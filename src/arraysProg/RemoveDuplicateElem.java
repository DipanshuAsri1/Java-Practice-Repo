package arraysProg;

import java.util.Arrays;
import java.util.TreeSet;

public class RemoveDuplicateElem {


    public static void main(String[] args) {

        int arr[]={2,1,5,7,8,1,3};

        //aproach 1 : use set or Treeset

        TreeSet set=new TreeSet();

        //approach 2  ( frequency )
        for(int i=0;i<arr.length;i++){
            if(set.contains(arr[i])){
                System.out.println("Dupl is : "+arr[i]);
            }
            set.add(arr[i]);
        }

        set.stream().forEach(s-> System.out.print(" "+s));
    }
}
