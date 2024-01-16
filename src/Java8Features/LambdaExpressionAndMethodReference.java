package Java8Features;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressionAndMethodReference {
    public static void main(String[] args) {

        List<String> names= Arrays.asList("Tom","Harry","Ruby");

        //for loop
        for(int i=0;i< names.size();i++){
            System.out.println(names.get(i));
        }

        //for each loop
        for(String s : names){
            System.out.println(s);
        }

        //Lambda Expressions
        names.forEach(name ->{
            System.out.println(name);
        });

        //method references
        names.forEach(System.out::println);
    }
}
