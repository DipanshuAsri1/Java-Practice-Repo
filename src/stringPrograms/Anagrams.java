package stringPrograms;

import java.util.Arrays;

public class Anagrams {

    public static void main(String[] args) {

        String str1="angel";
        String str2="glean";
        System.out.println(fun(str1,str2));

    }

    public static boolean fun(String str1 , String str2 ){
        if(str1.length()!=str2.length()){
            return false;
        }
        else{
            char[] strc=str1.toCharArray();
            char[] strc2=str2.toCharArray();
            Arrays.sort(strc);
            Arrays.sort(strc2);

            System.out.println("Val "+Arrays.equals(strc,strc2));
            for(int i=0;i<str1.length();i++){
                if(strc[i]!=strc2[i]){
                    return false;
                }
            }
        }

        return true;
    }
}
