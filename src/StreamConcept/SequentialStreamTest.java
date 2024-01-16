package StreamConcept;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class SequentialStreamTest {
    public static void main(String[] args) {

        Stream stream=Stream.of("Tom","Ron","Colt","Vicky");

        stream.findFirst()
                .ifPresent(System.out::println);

        //2.
        Arrays.asList("a1","a2","a3")
                .stream()
                .findFirst()
                .ifPresent(System.out::println);

        //3.range 1-5
        IntStream.range(1,11).forEach(System.out::println);

        //4.
        Arrays.stream(new int[]{1,3,2,4,6})
                .map(x-> 2 * x +1)
                .average()
                .ifPresent(System.out::println);

        //5.String data objects
        Stream.of("T190","R2","A100","V9")
                .map(s->s.substring(1))
                .mapToInt(Integer::parseInt)
                .max()
                .ifPresent(System.out::println);

        //6.Double to string objects
        Stream.of(1.0,2.0,3.0)
                .mapToInt(Double::intValue)
                .mapToObj(s->"a" +s)
                .forEach(System.out::println);

        //7.limit
        Stream.iterate(0,n->n+1).limit(10).forEach(System.out::println);

        //8.odd numbers : 10 odd numbers
        Stream.iterate(0,n->n+1)
                .filter(x->x%2!=0)
                .limit(10)
                .forEach(System.out::println);


    }
}
