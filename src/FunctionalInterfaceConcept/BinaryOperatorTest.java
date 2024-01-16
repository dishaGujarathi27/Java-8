package FunctionalInterfaceConcept;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorTest {
    public static void main(String[] args) {
        /*
        Represents an operation upon two operands of the same type, producing a result of
        the same type as the operands. This is a
        specialization of BiFunction for the case where
        the operands and the result are all of the same type.
         */

        BinaryOperator<Integer> func= (x,y) -> x+y;
        int result=func.apply(10,20);
        System.out.println(result);

        //Bifunction

        BiFunction<Integer , Integer , Integer> func1=(x , y) -> x+y;
        int r=func1.apply(25,35);
        System.out.println(r);
    }
}
