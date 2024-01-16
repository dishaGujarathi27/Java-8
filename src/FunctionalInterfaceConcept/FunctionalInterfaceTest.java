package FunctionalInterfaceConcept;

import java.util.function.Function;

public class FunctionalInterfaceTest {
    public static void main(String[] args) {

        /*
        Interface Function<t,R>
        T - the type of the input to the function
        R - the type of the result of the function

        */
        Function<String ,Integer> func=x -> x.length();
        int len=func.apply("this is it");
        System.out.println(len);

        //chaining function
        Function<Integer , Integer> func2=x -> x * 2;
        int len1 =func.andThen(func2).apply("This is Disha");
        System.out.println(len1);


    }
}
