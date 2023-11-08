package arraysProg;

import java.util.Arrays;
import java.util.HashSet;

//find duplicate elem in array
public class DuplicateElem {

    private static int arr[]={1,5,4,2,1,2};

    // try java 8
    public static void main(String[] args) {
        Arrays.stream(arr).distinct().forEach(x-> System.out.println(x));
        HashSet set=new HashSet();
        boolean dup=false;
        for(int i=0;i<arr.length;i++) {

            if(set.contains(arr[i])){
              dup=true;
                System.out.println("Elem is "+arr[i]);
            }else{
                set.add(arr[i]);
            }
        }
        if(!dup){
            System.out.println("Does not exist");
        }
    }
}
