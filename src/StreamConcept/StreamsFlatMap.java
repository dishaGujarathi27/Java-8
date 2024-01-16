package StreamConcept;

import java.util.Arrays;
import java.util.stream.Stream;

public class StreamsFlatMap {
    public static void main(String[] args) {
        String data[] []=new String[][]{
                {"a","b"},
                {"c","d"},
                {"e","f"}
        };

        Stream<String[] > datastream= Arrays.stream(data);

        //apply flat map on datastream
        Stream<String > streamFlatMap= datastream.flatMap(x->Arrays.stream(x));
        Stream<String> datastreamFilter=streamFlatMap.filter(x->"a".equals(x.toString()));
        datastreamFilter.forEach(System.out::println);





    }
}
