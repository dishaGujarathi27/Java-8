package Collections;

import javax.swing.*;
import java.security.Key;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapBasics {
    public static void main(String[] args) {

        //no order no indexing
        //stores values --key value pair
        //key can not be duplicate
        //can store n number of null values but only one key
        //hashmap is not thread safe
        HashMap<String , String> capitalMap=new HashMap<String ,String>();
        capitalMap.put("India","New Delhi");
        capitalMap.put("USA","Washington DC");
        capitalMap.put("UK","London");
        capitalMap.put("UK","London11");
        capitalMap.put(null,"Hong kong");
        capitalMap.put("Germany",null);
        capitalMap.put(null,"Tokyo");

        System.out.println(capitalMap.get("USA"));
        System.out.println(capitalMap.get("UK"));
        System.out.println(capitalMap.get(null));
        System.out.println(capitalMap.get("Germany"));

        //iterator over keySet
        Iterator<String> it=capitalMap.keySet().iterator();
        while (it.hasNext()){
            String key= it.next();
            String value=capitalMap.get(key);
            System.out.println(" Key :" + key  + "  Value : " +value);
        }
        System.out.println("----------------------------------");
        //iterator over entry set


        //iterate using java 8 for each and lambda
        capitalMap.forEach((k,v) -> System.out.println( " key " + k + " value " +v));


    }
}
