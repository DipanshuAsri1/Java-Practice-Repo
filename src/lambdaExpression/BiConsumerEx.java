package lambdaExpression;

import java.util.Objects;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class BiConsumerEx {
    public static void main(String[] args) {

        BiConsumer<Integer,Integer> biConsumer=new BiConsumer<Integer, Integer>() {
            @Override
            public void accept(Integer integer, Integer integer2) {
                System.out.println(integer.intValue()+integer2.intValue());
            }
        };

        biConsumer.accept(7,8);

        //It is used to unit test your code
        Predicate<Integer> pred= Objects::nonNull;
        System.out.println(pred.test(null));

        //biConsumer.andThen(null);
    }
}
