package FunctionalInterfaceConcept;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerOperaterTest {
    public static void main(String[] args) {

        /*
        Represents an operation that accepts a single input argument and returns no result.
        Unlike most other functional interfaces, Consumer is expected to operate via side effects.
         */

        Consumer<String> func=x -> System.out.println(x);
        func.accept("Hi ");

        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        list.forEach(x -> System.out.println(x));
    }
}
