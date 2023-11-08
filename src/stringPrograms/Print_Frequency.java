package stringPrograms;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * Input : GeeeEEKKKss
 * Output : G1e3E2K3s2
 */
public class Print_Frequency {

    public static void main(String[] args) {

        String s="GeeeEEKKKss";
        fun3(s);

    }
    public static void fun3(String s){


        String str=s.toString();

        char[] chsort = str.toCharArray();
        Arrays.sort(chsort);
        System.out.println(chsort);

        for(int i=0;i<str.length();i++){
            int count=1;
            char ch=str.charAt(i);
            while( i+1 < str.length() && ch==str.charAt(i+1)){
                count ++;
                i++;
            }
            System.out.print(ch+""+count);
            count=0;
        }
    }

    public static void fun(String s){
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            int count=0;
            char ch=s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
        }
        map.forEach((k,v)-> System.out.print(k+""+v));

    }
    public static void fun2(String s){

        for(int i=0;i<s.length();i++){
            int count=1;
            char ch=s.charAt(i);
            while(i+1 < s.length() && ch==s.charAt(i+1)){
                i++;
                count++;
            }
            System.out.print(s.charAt(i)
                    + "" + count + "");

        }
    }
}
