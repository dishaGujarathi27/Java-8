package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListIteration {

    public static void main (String [] args){
        ArrayList<String> studentlist=new ArrayList<String>();
        studentlist.add("Harry");
        studentlist.add("Ron");
        studentlist.add("Draco");
        studentlist.add("Dobby");

        //for loop
        for (String string : studentlist) {
            System.out.println(string);
        }
        System.out.println("------------");

        //for each
        for(String s : studentlist){
            System.out.println(s);
        }

        System.out.println("------------");
       //lambda function with stream
        studentlist.forEach(System.out::println); //you can take any variable instead of ele

        //Iterator
        for (String s : studentlist) {
            System.out.println(s);
        }

    }

}
