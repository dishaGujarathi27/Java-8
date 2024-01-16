package Collections;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class ComparisionHashMap {
    public static void main(String[] args) {
        HashMap<Integer ,String> map1=new HashMap<Integer , String>();

        map1.put(1,"A");
        map1.put(2,"B");
        map1.put(3 ,"C");

        HashMap<Integer ,String> map2=new HashMap<Integer , String>();

        map2.put(3 ,"C");
        map2.put(2,"B");
        map2.put(1,"A");

        HashMap<Integer ,String> map3=new HashMap<Integer , String>();

        map3.put(1,"A");
        map3.put(2,"B");
        map3.put(3 ,"C");
        map3.put(3 ,"D");

        // 1. on the basis of key value
        System.out.println(map1.equals(map2)); // true
        System.out.println(map2.equals(map3)); // false

        System.out.println("--------------------------------");

        //2. on the basis of same keys :key set
        System.out.println(map1.keySet().equals(map2.keySet()));//true
        System.out.println(map2.keySet().equals(map3.keySet()));//true
        System.out.println(map1.keySet().equals(map3.keySet()));//true as set does'nt acknowledge duplicate values


        System.out.println("--------------------------------");
        //3. find out the extra key
        HashMap<Integer ,String> map4=new HashMap<Integer , String>();

        map4.put(1,"A");
        map4.put(2,"B");
        map4.put(3 ,"C");
        map4.put(4 ,"D");

        //combine the keys from both maps using HashSet
        HashSet<Integer> combineKeys=new HashSet<>(map1.keySet());
        combineKeys.addAll(map4.keySet());
        combineKeys.removeAll(map1.keySet());
        System.out.println(combineKeys);

        //compare maps by values
        HashMap<Integer ,String> map5=new HashMap<Integer , String>();

        map5.put(1,"A");
        map5.put(2,"B");
        map5.put(3 ,"C");

        HashMap<Integer ,String> map6=new HashMap<Integer , String>();

        map6.put(4 ,"A");
        map6.put(5,"B");
        map6.put(6,"C");

        HashMap<Integer ,String> map7=new HashMap<Integer , String>();

        map7.put(1,"A");
        map7.put(2,"B");
        map7.put(3 ,"C");
        map7.put(4 ,"C");


        System.out.println(new ArrayList<>(map5.values()).equals(new ArrayList<>(map6.values())));//true
        //In ArrayList it will not ignore the value
        System.out.println(new ArrayList<>(map6.values()).equals(new ArrayList<>(map7.values())));//false


        System.out.println(new HashSet<>(map5.values()).equals(new HashSet<>(map6.values())));
        System.out.println(new HashSet<>(map6.values()).equals(new HashSet<>(map7.values())));


    }


}
