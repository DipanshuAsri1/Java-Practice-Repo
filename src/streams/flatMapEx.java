package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
What is the difference between map(), flatMap(), and reduce() in the Stream API?
 */
public class flatMapEx {
    public static void main(String[] args) {

        List<List<String>> listOfLists = Arrays.asList(Arrays.asList("a","b"),Arrays.asList("c","d"));
        List<String> flattenedList= listOfLists.stream().flatMap(List::stream).collect(Collectors.toList());
        List<Stream<String>> mapList= listOfLists.stream().map(List::stream).collect(Collectors.toList());
        System.out.println(flattenedList);

        // It returns stream of stream
        System.out.println(mapList);

        //reduce ( reduce combines all teh element into a single value)
        List<Integer> numbers=Arrays.asList(1,2,3,4,5);
        int sum=numbers.stream().reduce(0,Integer::sum);
        System.out.println("Sum is "+sum);

    }
}
