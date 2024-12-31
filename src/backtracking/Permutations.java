package backtracking;

import java.util.ArrayList;
import java.util.List;
/*
 Iterate over each character
 -> for each character
    - start to pick 1st character
    - go back
    - try picking the next
 */
public class Permutations {

    public static void main(String[] args) {

          int nums[]={1,2,3};
        System.out.println(permute(nums));
    }
    // Time complexity ( O(n!) * n ) ,
    public static  List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> list=new ArrayList<List<Integer>>();

        backtrack(list,new ArrayList<>(),nums);

        return list;
    }

    private static void backtrack(List<List<Integer>> list, ArrayList<Integer> tempList, int[] nums) {

        if(tempList.size()==nums.length){
            list.add(new ArrayList<>(tempList));
            return;
        }

        for(int number:nums){

            //skip if we get the same elem
            if(tempList.contains(number))
                continue;

            //add the new element
            tempList.add(number);

            //Go back to try other elem
            backtrack(list,tempList,nums);

            //Remove the elem
            tempList.remove(tempList.size()-1);
        }
    }
}
