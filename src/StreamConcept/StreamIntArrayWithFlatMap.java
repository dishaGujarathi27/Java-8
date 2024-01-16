package StreamConcept;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamIntArrayWithFlatMap {
    public static void main(String[] args) {

        int data []={1,2,3,4,5,6,7,8,9,10};
        Stream<int[]> streamArray=Stream.of(data);

        IntStream intStream=streamArray.flatMapToInt(s-> Arrays.stream(s));
        intStream.forEach(s-> System.out.println(s));
    }

}
