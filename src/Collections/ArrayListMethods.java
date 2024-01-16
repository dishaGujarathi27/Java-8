package Collections;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListMethods {

    public static void main(String [] args){

        //addAll Method
        ArrayList<String> s1=new ArrayList<String>();
        s1.add("Disha");
        s1.add("Mona");
        s1.add("Jyoti");

        ArrayList<String> s2=new ArrayList<String>();
        s2.add("Java");
        s2.add("Selenium");

        s2.addAll(s1);
        System.out.println(s2);

        //Given a list print even as well as odd numbers
        ArrayList<Integer> numbers = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers.removeIf(num -> num%2==0);
        System.out.println(numbers);

        ArrayList<Integer> numbers1 = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6,7,8,9,10));
        numbers1.removeIf(num -> num%2!=0);
        System.out.println(numbers1);



    }
}
