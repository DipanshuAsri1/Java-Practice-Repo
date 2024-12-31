package lambdaExpression;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FunctionIdentityEx {

    //Converting ArrayList to HashMap using Method Reference in Java 8
    public static void main(String[] args) {

        ArrayList<String> list=new ArrayList<String>();
        list.add("Hello");
        list.add("manga");
        list.add("Biker");

        //Function.identity() refers to an element making itself as the key of the HashMap.
        HashMap<String,Integer> x= list.stream().collect(Collectors.toMap(Function.identity(),String::length,(e1, e2)->e1,HashMap::new));
        System.out.println(x);
    }

}
