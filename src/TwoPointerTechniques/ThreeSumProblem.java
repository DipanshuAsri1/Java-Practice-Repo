package TwoPointerTechniques;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
// as per 2 point technique you should first sort the array
https://www.interviewkickstart.com/blogs/problems/3-sum
{
"arr": [10, 3, -4, 1, -6, 9]
}

["10,-4,-6", "3,-4,1"]
 */
public class ThreeSumProblem {
//o(n*n + nlgn)
    public static void main(String[] args) {
        List<Integer> listInt=Arrays.asList(10,3,-4,1,-6,9);
        Collections.sort(listInt);
        System.out.println(listInt);

        int n=listInt.size();
        for(int i=0;i<n;i++){
           int currElem= listInt.get(i);
           int neededSum=-currElem;
           int left=i+1; int right=n-1;

           while(left<right){
               int sum= listInt.get(left)+ listInt.get(right);

               if(neededSum==sum){
                   System.out.println(listInt.get(left)+","+listInt.get(right)+","+currElem);
                   left++;
               }
               if(sum>neededSum){
                  right--;
               }else{
                   left++;
               }

           }

        }
    }
}
