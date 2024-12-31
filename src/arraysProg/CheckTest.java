package arraysProg;

import java.util.*;
import java.util.stream.Collectors;

public class CheckTest {

    public static void main(String[] args) {


                String str1="Hello";
        //str.startsWith(String.valueOf(ch));
        str1.substring(0,str1.length());
        System.out.println("flight".indexOf("flower"));

        System.out.println("str "+str1);
        System.out.println("Modulo "+2%1000);
        System.out.println("Division"+2/10);
        HashMap<String,Integer> map1=new HashMap<String,Integer>();
        String str="abc";
        map1.put(new String("abc"),1);
        map1.put(str,2);

        System.out.println(map1);


        String t= new String("Hello");
        String b="Hello";
        String c="Hello";

        System.out.println(b==t);
        System.out.println(b==c);

        System.out.println("val "+5/2);

        //print duplicate character
        //[a, c, t, e, o]
        String inputString = "Java Concept Of The Day";

        Map<Character , Integer> map=new HashMap<>();
        for(int i=0;i<inputString.length();i++){
            char ch=inputString.charAt(i);

            map.put(ch,map.getOrDefault(ch,0)+1);
//            if(map.containsKey(ch)){
//                map.put(ch,(int)map.get(ch)+1);
//            }else{
//                map.put(ch,1);
//            }
        }
        System.out.println(map);



    }
}
