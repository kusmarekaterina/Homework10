import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {

        //Task1
        Predicate <Integer> predicate = new Predicate <Integer>() {
            @Override
            public boolean test (Integer integer) {
                return integer > 0;
            }
        };

        Predicate <Integer> predicate2 = x -> x > 0;

        //Task2

        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.printf("Привет, %s", s);
            }
        };

        Consumer <String> consumer2 = s -> System.out.printf("Привет, %s", s);

        //Task3

        Function <Double, Long> function = new Function<Double, Long>() {
            @Override
            public Long apply(Double o) {
                Long o1 = Math.round (o);
                return o1;
            }
        };

        Function <Double, Long> function2 = aDouble -> Math.round(aDouble);

        //Task4

        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100+1);
            }
        };

        Supplier<Integer> supplier2 = () -> {
            return (int) (Math.random() * 100+1);
        };
    }

    //Task5

    public static <T, U> Function <T, U> ternaryOperator (
            Predicate <? super T> condition,
            Function <? super T, ? extends U> ifTrue,
            Function <? super T, ? extends U> ifFalse) {
        return t -> condition.test(t) ? ifTrue.apply(t) : ifFalse.apply(t);
    }
}