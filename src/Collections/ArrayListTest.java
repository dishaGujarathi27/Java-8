package Collections;



import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListTest {
    public static void main(String[] args){
        ArrayList <Object> ar = new ArrayList<Object>();
        ar.add(10);
        ar.add("Java");
        ar.add(123);

        System.out.println(ar.get(0));
        System.out.println(ar.size()-1);

        ArrayList<Integer> numbers=new ArrayList<Integer>(Arrays.asList(10,50,89,70));
        System.out.println(numbers);


        ArrayList<String> names=new ArrayList<String>(Arrays.asList("disha","mona","jyoti"));
        System.out.println(names);
    }

}
