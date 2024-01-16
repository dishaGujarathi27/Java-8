package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {
    public static void main(String[] args) {
        Map<String , Integer> marks=new HashMap<String , Integer>();
        marks.put("Tom",100);
        marks.put("Harry",200);
        marks.put("Steve",300);
        marks.put("Lisa",400);
        marks.put(null, 500);

        //hashing:hashcode
        System.out.println(marks.get("Lisa"));

        //hashcode of Lisa -210678
        //index=15
        //equals to check the key name
        //Lisa
        //returns value



    }
}
