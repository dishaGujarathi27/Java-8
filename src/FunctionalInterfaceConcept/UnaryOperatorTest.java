package FunctionalInterfaceConcept;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class UnaryOperatorTest {
    public static void main(String[] args) {
        /*
        Represents an operation on a single operand that produces a result of the
         same type as its operand.
        This is a specialization of Function for the case where the operand and result are
        of the same type.
         */

        UnaryOperator<Integer> func=x -> x*7;
        int res=func.apply(10);
        System.out.println(res);

        // we can do the same with Function interface as the unary extends the function
        Function<Integer , Integer> func1=x -> x*10;
        System.out.println(func1.apply(50));

        //one with arraylist
        List<String> names=new ArrayList<String>();
        names.add("Harry");
        names.add("Ron");
        names.add("Hermione");

        names.replaceAll(ele -> ele + "   Hogwarts");
        System.out.println(names);
    }
}
