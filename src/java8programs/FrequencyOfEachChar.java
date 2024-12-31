package java8programs;

import java.util.Comparator;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FrequencyOfEachChar {
    public static void main(String[] args) {
        String str="Helllohell";
        System.out.println(str.chars().mapToObj(c->(char)c).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())));


        // to find odd numbers
       IntStream ins= IntStream.of(1,2,3,6,4,5);
       //ins.mapToObj(x->(int)x).filter(x->(x%2)!=0).forEach(System.out::println);
       //ins.close();

        // To find max number
        System.out.println("Max is : "+ ins.mapToObj(x->(int)x).max(Comparator.naturalOrder()).get().intValue());

    }

    //name , dept , slary

}
