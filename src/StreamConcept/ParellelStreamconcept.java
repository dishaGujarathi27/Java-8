package StreamConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ForkJoinPool;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ParellelStreamconcept {
    public static void main(String[] args) {
        ForkJoinPool corePools=ForkJoinPool.commonPool();
        System.out.println(corePools.getParallelism());

        //1.parallel method on stream

        Stream stream=Stream.of("Navit","Peter","Sheldon","Lenard");
        // BaseStream parallelStream = stream.parallel()
        Stream.of("Shelly","Penny","Ammy","Howard","Raj").forEach(System.out::println);
        System.out.println("---------------------");
        Stream.of("Shelly","Penny","Ammy","Howard","Raj").parallel().forEach(System.out::println);

        // 2 . use parallel stream method on collection stream
        Arrays.asList("Shelly","Penny","Ammy","Howard","Raj").parallelStream().forEach(System.out::println);

        //1-10
        IntStream.rangeClosed(1,10).forEach(System.out::println);
        System.out.println("-----------");
        IntStream.rangeClosed(1,10).parallel().forEach(System.out::println);

        //from a-z : 97-122
        alphabetList().forEach(System.out::println);
        System.out.println("---------------------");
        alphabetList().parallelStream().forEach(System.out::println);

        //check stream is running in parallel mode: isParallel() method
        IntStream range=IntStream.rangeClosed(1,10);
        System.out.println(range.isParallel());
        System.out.println("---------------------");
        IntStream range1=IntStream.rangeClosed(1,10);
        range1.parallel();
        System.out.println(range1.isParallel());



    }
    public static List<String> alphabetList(){
        List<String> alpha=new ArrayList<>();
        int n=97;
        while ((n<=122)){
            char c=(char)n;
            alpha.add(String.valueOf(c));
            n++;
        }


        return alpha;
    }
}
