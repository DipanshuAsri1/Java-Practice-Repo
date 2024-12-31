package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class MaxNumber {

    public static void main(String[] args) {

        ArrayList<Integer> list=new ArrayList<Integer>();
        list.add(33);
        list.add(55);
        list.add(8);

        int maxval=list.stream().max(Comparator.comparing(Integer::intValue)).get().intValue();
        System.out.println(maxval);
        Stream.generate((Supplier<Integer>) () -> (int) (Math.random() * 100)) // Supplier to generate random integers
                .limit(10) // Limiting the stream to 10 elements
                .filter((Predicate<Integer>) num -> num % 2 == 0) // Predicate to filter even numbers
                .map((Function<Integer, String>) Object::toString) // Function to convert integers to strings
                .forEach((Consumer<String>) System.out::println); // Consumer to print each string

    }

}
