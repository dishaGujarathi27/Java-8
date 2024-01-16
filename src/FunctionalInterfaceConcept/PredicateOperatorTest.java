package FunctionalInterfaceConcept;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateOperatorTest {
    public static void main(String[] args) {
        Predicate<Integer> func=x -> x>5;
        List<Integer> list= Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        List<Integer> collist=list.stream().filter(func).collect(Collectors.toList());
        System.out.println(collist);

        //predicate with && :
        List<Integer> collist1=list.stream().filter(x -> x>5 && x<9).collect(Collectors.toList());
        System.out.println(collist1);

        //predicate with negate()
        List<String> names=Arrays.asList("Naveen","Nav","Nave","Java","jav","ja");
        Predicate<String> namesExp=x -> x.startsWith("Nav");
        List<String> newnamesList =names.stream().filter(namesExp.negate()).collect(Collectors.toList());
        System.out.println(newnamesList);




    }
}
