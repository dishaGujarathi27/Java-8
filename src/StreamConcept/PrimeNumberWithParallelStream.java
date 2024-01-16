package StreamConcept;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithParallelStream {
    public static void main(String[] args) {

        long count= Stream.iterate(0,n->n+1)
                .limit(10000)
                .parallel()
                .filter(PrimeNumberWithParallelStream::isPrime)
                .peek(x-> System.out.println(x))
                .count();
        System.out.println("total prime numbers :  " +count);


    }
    public static boolean isPrime(int number){
        if(number<1) return false;
        return !IntStream.rangeClosed(2,number/2).anyMatch(x->number%x==0);

    }
}
