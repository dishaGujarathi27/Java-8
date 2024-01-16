package Collections;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapTest {
    public static void main(String[] args) {

        TreeMap<Integer , String> map = new TreeMap<Integer , String>();
        map.put(1000,"Tom");
        map.put(4000,"Peter");
        map.put(1800,"Steve");
        map.put(3000,"Lisa");
        map.put(1200,"Robert");

       // It maintains order in ascending manner regardless of the insertion order
        System.out.println(map);

        //It prints in sorting manner
        map.forEach((k,v) -> System.out.println(" Key  :  " + k  + "  Value  :  "  +v) );

        System.out.println(map.lastKey());
        System.out.println(map.firstKey());

        // for checking less than with headmap
        Set<Integer> keyslessThan3k=map.headMap(3000).keySet();
        System.out.println(keyslessThan3k);

        //for checking greater than with tailmap
        Set<Integer> keysGreaterThan3k=map.tailMap(3000).keySet();
        System.out.println(keysGreaterThan3k);

        TreeMap<String , Integer> map1 = new TreeMap<String , Integer>();
        map1.put("James",100);
        map1.put("Thomas",400);
        map1.put("Tyler",50);
        map1.put("John",900);

        map1.forEach((k,v) -> System.out.println(" Key  : " +k  +" Value :  "+v ));

        // to sort in descending order

        TreeMap<Integer , String> map2 = new TreeMap<Integer , String>(Comparator.reverseOrder());
        map2.put(11000,"Tom");
        map2.put(4000,"Peter");
        map2.put(1800,"Steve");
        map2.put(3000,"Lisa");
        map2.put(1200,"Robert");

        System.out.println(map2);



    }
}
