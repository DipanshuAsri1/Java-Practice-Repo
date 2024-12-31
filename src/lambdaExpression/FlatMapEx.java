package lambdaExpression;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapEx {


    public static void main(String[] args) {

        //flatten the list of list
        List<List<Integer>> number=new ArrayList<>();

        number.add(Arrays.asList(1,2));
        number.add(Arrays.asList(5,6));
        number.add(Arrays.asList(6,7));

       List<Integer> list= number.stream().flatMap(Collection::stream).collect(Collectors.toList());

       list.forEach(x-> System.out.print("->"+x.intValue()));
    }



}
