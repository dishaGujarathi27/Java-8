package StreamConcept;

import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class InfiniteStreamConcept {
    public static void main(String[] args) {
        //infinite stream is used to generate infinite stream of data

        //1.iterate()
        //static(T seed,Unary operator<T> f)
        //returns a statement -->Stream<T>

        List<Integer> collect= IntStream.iterate(0,n->n+2)
                .mapToObj(Integer::valueOf)
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(collect);

        //2.generate()
        //static generate (Supplier<T> s)
        //random numbers -- 100

        List<Integer> collect2= Stream.generate(()->(new Random()).nextInt(200))
                .limit(10)
                .collect(Collectors.toList());
        System.out.println(collect2);


    }
}
